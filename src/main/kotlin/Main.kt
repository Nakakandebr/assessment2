
fun main(){
    getmultiples()
    isValidPassword("1478sgtwe")
    var currentAccount=CurrentAccount("19000342ARC","Nakakande Bridget",456798.00)
    currentAccount.details()
    currentAccount.deposit(24987.0)
    currentAccount.withdrawal(2564.0)

}


// write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
data class get(var word:String)
fun randomString(word:String){
val getfirst=word[0]
val getlast=word.length

    val  gatall=(getfirst,getlength)
return gatall

}



//2. Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
fun isValidPassword(password:String) :Boolean{
 if (password.length in 8..16  && password.toLowerCase()==="password" ) {
     return true
  }
    else if (!/\d/.test(password)){




    }



//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)

//3. Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun getmultiples(){
    for(i in 1..100){
        if(i%6==0 && i%8==0){
            println("Bingo")


        }
        else if (i%6==0){
            println(i)


        }
        else if(i%8==0){

            println(i)

        }

    }



}





//4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
 open class CurrentAccount(var accountNumber:String, var accountName:String, var balance:Double){
    fun deposit(amount: Double){
       val total =balance+amount
        println(total)



    }

  fun withdrawal(amount: Double){

    val remaining=balance-amount
    println(remaining)


}
fun details(){
    println("$accountNumber with balance $balance is operated by $accountName")



}


}
class SavingAccount( accountNumber:String,  accountName:String,  balance:Double, var withdrawals:Int):CurrentAccount(accountNumber,accountName,balance){
     fun  savingAccountwithdrawal(amount: Int) {




    }




}


//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)
//5. Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
//



















