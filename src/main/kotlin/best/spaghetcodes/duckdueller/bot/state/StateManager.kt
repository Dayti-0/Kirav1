package best.spaghetcodes.duckdueller.bot.state

import net.minecraft.entity.player.EntityPlayer

object StateManager {
    @JvmField var ticksSinceGameStart: Int = 0
        private set
    @JvmField var inDuel: Boolean = false
        private set

    // Optional: store a soft target reference if you want
    var target: EntityPlayer? = null

    fun onGameStart() {
        ticksSinceGameStart = 0
        inDuel = true
    }

    fun onGameEnd() {
        inDuel = false
    }

    fun tick() {
        if (inDuel) ticksSinceGameStart++
    }

    fun reset() {
        ticksSinceGameStart = 0
        target = null
    }
}
