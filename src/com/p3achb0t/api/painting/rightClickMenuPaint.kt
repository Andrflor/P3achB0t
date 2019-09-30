package com.p3achb0t.api.painting

import com.p3achb0t.api.Utils
import com.p3achb0t.ui.Context
import java.awt.Color
import java.awt.Graphics

fun rightClickMenuPaint(g: Graphics, ctx: Context) {
    try {
        // Look into menu
        val mCount = ctx.client.getMenuOptionsCount()
        val heigth = ctx.client.getMenuHeight()
        val width = ctx.client.getMenuWidth()
        val mX = ctx.client.getMenuX()
        val mY = ctx.client.getMenuY()
        val mVisible = ctx.client.getIsMiniMenuOpen()
        if (mVisible) {
            g.color = Color.YELLOW
            g.drawRect(mX, mY, width, heigth)
            val baseHeight = 18
            val lineHeight = 15
            var yDiff = baseHeight
            for (i in 1..mCount) {

                g.color = Color.BLUE
                g.drawRect(mX - 1, mY + yDiff, width, lineHeight)
                var menuAction = ctx.client.getMenuActions()[mCount - i]
                menuAction = Utils.cleanColorText(menuAction)
                var menuOption = ctx.client.getMenuTargetNames()[mCount - i]
                menuOption = Utils.cleanColorText(menuOption)
                val action = "$menuAction $menuOption"
                g.color = Color.GREEN

                g.drawString(action, mX + width, mY + yDiff + (lineHeight / 2) + 7)
                yDiff += lineHeight
            }
        }
    } catch (e: Exception) {
        println("Error: Menu " + e.message)
    }
}