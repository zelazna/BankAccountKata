import commands.*
import models.Account

fun main(args: Array<String>) {
    val account = Account(500.0)
    account.addToQueue(OrderDepositCommand(20.0))
            .addToQueue(OrderDepositCommand(50.0))
            .addToQueue(OrderWithdrawalCommand(20.5))
            .addToQueue(OrderDepositCommand(20.0))
            .addToQueue(OrderWithdrawalCommand(800.0))
            .processCommands()
            .getHistory()
    //    getHistory() Output
    //    <Type: Deposit, amount: 20.0, balance: 520.0, date: 2018-07-31T08:49:17.380> <----
    //    <Type: Deposit, amount: 50.0, balance: 570.0, date: 2018-07-31T08:49:17.400> <----
    //    <Type: Withdrawal, amount: 20.5, balance: 549.5, date: 2018-07-31T08:49:17.400> ----->
    //    <Type: Deposit, amount: 20.0, balance: 569.5, date: 2018-07-31T08:49:17.400> <----
    //    <Type: Withdrawal, amount: 800.0, balance: -230.5, date: 2018-07-31T08:49:17.400> ----->

}