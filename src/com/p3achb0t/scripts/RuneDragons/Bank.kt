package com.p3achb0t.scripts.RuneDragons

import com.p3achb0t.api.Context
import com.p3achb0t.api.wrappers.utils.Utils
import com.p3achb0t.api.wrappers.Tile
import com.p3achb0t.api.wrappers.tabs.Equipment
import com.p3achb0t.api.wrappers.tabs.Prayer
import com.p3achb0t.api.wrappers.widgets.Widget
import com.p3achb0t.api.wrappers.widgets.WidgetID.LogoutPanel.WORLD_SWITCHER_BUTTON
import com.p3achb0t.scripts.RuneDragsMain
import com.p3achb0t.scripts.Task
import kotlinx.coroutines.delay
import net.runelite.api.MenuOpcode
import java.util.*

class Bank(val ctx: Context) : Task(ctx.client) {
    override suspend fun isValidToRun(): Boolean {
        return RuneDragsMain.shouldBank(ctx)
    }


    override suspend fun execute() {
        println(MenuOpcode.WIDGET_DEFAULT.id)
        println(ctx.widgets.find(182, 3)!!.getId())
        val bank = ctx.gameObjects.find(4483)
        ctx.client.doAction(-1, ctx.widgets.find(182, 3)!!.getId(), MenuOpcode.WIDGET_DEFAULT.id, 1,  "World Switcher", "", 658, 384)
        delay(1000)

//        var cwBank = Tile(2442, 3083, 0 , ctx=ctx)
//        var duelingids = hashSetOf(2552, 2554, 2556, 2558, 2560, 2562, 2564, 2566).shuffled()
//        var pendantids = hashSetOf(11194,11193,11192,11191,11190).shuffled()
//        var antifires = hashSetOf(11951, 11953, 11955, 11957).shuffled()
//        var extendedantifires = hashSetOf(22209, 22212, 22215).shuffled()
//        var supercombats = hashSetOf(23688, 23691, 23685).shuffled()
//
//        run teleportcw@{
//        if(cwBank.distanceTo() > 25) {
//            duelingids.forEach {
//                    if (ctx.inventory.Contains(it) && ctx.equipment.getItemAtSlot(Equipment.Companion.Slot.Ring)?.id != it) {
//                        ctx.inventory.getItem(it)?.click()
//                        delay(600)
//                    }
//                    if (ctx.equipment.getItemAtSlot(Equipment.Companion.Slot.Ring)?.id == it) {
//                        ctx.equipment.interactWithSlot(Equipment.Companion.Slot.Ring, "Castle wars")
//                        Utils.waitFor(5, object : Utils.Condition {
//                            override suspend fun accept(): Boolean {
//                                delay(100)
//                                return cwBank.distanceTo() < 25
//                            }
//                        })
//                    }
//                    if (cwBank.distanceTo() < 25) {
//                        return@teleportcw
//                    }
//                }
//            }
//            if(cwBank.distanceTo() < 25) {
//                if(ctx.prayer.isProtectMageActive()){
//                    ctx.prayer.disable(Prayer.Companion.PrayerKind.PROTECT_FROM_MAGIC);
//                }
//                if(ctx.prayer.isPietyActive()){
//                    ctx.prayer.disable(Prayer.Companion.PrayerKind.PIETY);
//                }
//                val bank = ctx.gameObjects.find(4483)
//                if(!ctx.bank.isOpen()) {
//                    if (bank.size > 0) {
//                        if (!bank[0].isOnScreen()) {
//                            bank[0].turnTononeco()
//                            Utils.waitFor(5, object : Utils.Condition {
//                                override suspend fun accept(): Boolean {
//                                    delay(100)
//                                    return bank[0].isOnScreen()
//                                }
//                            })
//                        }
//                        if (bank[0].isOnScreen()) {
//                            bank[0].click()
//                            Utils.waitFor(5, object : Utils.Condition {
//                                override suspend fun accept(): Boolean {
//                                    delay(100)
//                                    return ctx.bank.isOpen()
//                                }
//                            })
//                        }
//                    }
//                }
//                if(ctx.bank.isOpen()) {
//                    if(!ctx.inventory.isEmpty()) {
//                        ctx.bank.depositAll()
//                    }
//                    delay(500)
//                    ctx.bank.withdraw(2434, "Prayer pot", 4)
//                    delay(600)
//                    run withdrawdueling@{
//                        duelingids.forEach {
//                            if(!ctx.inventory.Contains(it) && ctx.bank.getItemCount(it) > 0){
//                                ctx.bank.withdraw1(it, "Ring of duel")
//                                delay(600)
//                            }
//                            if(ctx.inventory.Contains(it)){
//                                return@withdrawdueling
//                            }
//                        }
//                    }
//                    run withdrawpendant@{
//                        pendantids.forEach {
//                            if(!ctx.inventory.Contains(it) && ctx.bank.getItemCount(it) > 0){
//                                ctx.bank.withdraw1(it, "digsite")
//                                delay(600)
//                            }
//                            if(ctx.inventory.Contains(it)){
//                                return@withdrawpendant
//                            }
//                        }
//                    }
////                    run withdrawantifire@{
////                        antifires.forEach {
////                            if(!ctx.inventory.Contains(it) && ctx.bank.getItemCount(it) > 0){
////                                ctx.bank.withdraw1(it, "antifire")
////                                delay(600)
////                            }
////                            if(ctx.inventory.Contains(it)){
////                                return@withdrawantifire
////                            }
////                        }
////                    }
//                    run extendedantifires@{
//                        extendedantifires.forEach {
//                            if(!ctx.inventory.Contains(it) && ctx.bank.getItemCount(it) > 0){
//                                ctx.bank.withdraw1(it, "extended")
//                                delay(600)
//                            }
//                            if(ctx.inventory.Contains(it)){
//                                return@extendedantifires
//                            }
//                        }
//                    }
//                    run withdrawsupercombats@{
//                        supercombats.forEach {
//                            if(!ctx.inventory.Contains(it) && ctx.bank.getItemCount(it) > 0){
//                                ctx.bank.withdraw1(it, "divine super")
//                                delay(600)
//                            }
//                            if(ctx.inventory.Contains(it)){
//                                return@withdrawsupercombats
//                            }
//                        }
//                    }
//                    ctx.bank.withdrawAll(385, "Shark")
//                    delay(600)
//                }
//            }
//        }
//        ctx.client.doAction(-1, WidgetInfo.WORLD_SWITCHER_BUTTON.getId(), MenuOpcode.WIDGET_DEFAULT.getId(), 1, "World Switcher", "", 658, 384)
    }
}