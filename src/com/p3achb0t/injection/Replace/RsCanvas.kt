package com.p3achb0t.injection.Replace

import com.p3achb0t.client.injection.InstanceManager
import java.awt.Canvas
import java.awt.Graphics
import java.awt.RenderingHints
import java.awt.image.BufferedImage


open class RsCanvas(val scriptManager: InstanceManager) : Canvas() {

    private val gameCanvas: BufferedImage = BufferedImage(scriptManager.canvasWidth, scriptManager.canvasHeight, BufferedImage.TYPE_INT_RGB)
    private val screen: BufferedImage = BufferedImage(scriptManager.canvasWidth, scriptManager.canvasHeight, BufferedImage.TYPE_INT_RGB)

    private var count = 0

    init {
        super.setFocusable(true)
        scriptManager.setGameImage(screen)
    }

    override fun getGraphics() : Graphics {
        val g = gameCanvas.createGraphics()
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)


        if (scriptManager.isContextLoaded) {
            //scriptManager.paintScript(g)
            scriptManager.paintDebugScript(g)
            g.drawString("o", scriptManager.ctx.mouse.getX(), scriptManager.ctx.mouse.getY())
        }

        // screen shot logic
        if (scriptManager.captureScreen && count > scriptManager.captureScreenFrame) {
            val noob = screen.createGraphics()
            noob.drawImage(gameCanvas, 0, 0, null)
            count = 0
        }
        count++


        try {
            super.getGraphics().drawImage(gameCanvas, 0, 0, null)
        }catch (e: Exception){ }

        return g
    }
}