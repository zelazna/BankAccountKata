package commands

import java.time.LocalDateTime

class OrderDepositCommand(private val amount: Double) : OrderCommand {
    override var executedAt: LocalDateTime? = null
    override var balance: Double = 0.0

    override fun execute(value: Double, date: LocalDateTime): Double {
        balance = value + amount
        executedAt = date
        return balance
    }

    override fun toString(): String {
        return "<Type: Deposit, amount: $amount, balance: $balance, date: $executedAt> <---- "
    }
}