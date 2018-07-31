package commands

import java.time.LocalDateTime

interface OrderCommand {
    var balance: Double
    var executedAt: LocalDateTime?
    fun execute(value: Double, date:LocalDateTime): Double
}