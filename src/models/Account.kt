package models

import commands.OrderCommand
import java.time.LocalDateTime

class Account(private var base_value: Double) {
    private val orderQueue = ArrayList<OrderCommand>()
    private val orderHistory = ArrayList<OrderCommand>()

    fun addToQueue(orderCommand: OrderCommand): Account = apply { orderQueue.add(orderCommand) }

    fun processCommands(): Account = apply {
        orderQueue.forEach {
            base_value = it.execute(base_value, LocalDateTime.now())
            orderHistory.add(it)
        }
        orderQueue.clear()
    }

    fun getHistory(): Account = apply { orderHistory.forEach { println(it) } }
}