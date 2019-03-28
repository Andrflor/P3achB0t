package com.p3achb0t.rsclasses

import jdk.internal.org.objectweb.asm.Opcodes
import jdk.internal.org.objectweb.asm.tree.ClassNode

class Player:RSClasses() {

//    Actor.animation bw bo 398323101
//    Actor.animationDelay bw bs 1989447085
//    Actor.combatTime bw be -2104684633
//    Actor.frameOne bw bk 1227200279
//    Actor.frameTwo bw bc -2070938991
//    Actor.healthBars bw bq
//    Actor.hitCycles bw bi
//    Actor.hitDamages bw bf
//    Actor.hitTypes bw af
//    Actor.interacting bw be -2104684633
//    Actor.localX bw at -1164280689
//    Actor.localY bw ad 471959047
//    Actor.message bw au
//    Actor.orientation bw cx 727736179
//    Actor.queueSize bw cr -2147108073
//    Actor.queueTraversed bw co
//    Actor.queueX bw ca
//    Actor.queueY bw ce
//    Actor.runtimeAnimation bw bv 508548421
//    Actor.standAnimation bw ah -1436317107
    companion object {
        const val deobName = "PLAYER"
    }
    override fun analyze(node: ClassNode, rsClassesMap: Map<String,RSClasses>) {
        val actor = rsClassesMap[Actor.deobName] as Actor
//        val isAbstract = (node.access and Opcodes.ACC_ABSTRACT) != 0
        if(actor.name == node.superName && node.fields.size > 5){
            println("Player: " + node.name)
            this.name = node.name
            this.found = true
//            println("   Number of Fields: " + node.fields.size)
//
//            println("abstract and: " + (node.access and Opcodes.ACC_ABSTRACT).toString())
//            println("   access abstract: $isAbstract")
//            println("   number of methods: " + node.methods.size)
//            println("   outerClass:\t" + node.outerClass)
//            println("   outerMethod:\t" + node.outerMethod)
//            println("   outerMethodDesc:\t" + node.outerMethodDesc)
//            println("   signature:\t" + node.signature)
//            println("   access:\t" + node.access)
//            println("   outerClass:\t" + node.)
//            println("   outerClass:\t" + node.outerClass)
//            println("   outerClass:\t" + node.outerClass)

        }
    }
}