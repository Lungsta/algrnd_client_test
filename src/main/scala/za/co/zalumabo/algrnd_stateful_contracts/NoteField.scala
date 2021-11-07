package za.co.zalumabo.algrnd_stateful_contracts

import com.algorand.scalgorand.account.Account
import com.algorand.scalgorand.transaction.SignedTransaction
import com.algorand.scalgorand.transaction.Transaction
import com.algorand.scalgorand.util.Encoder
import com.algorand.scalgorand.v2.client.common.AlgodClient
import com.algorand.scalgorand.v2.client.common.Response
import com.algorand.scalgorand.v2.client.model.NodeStatusResponse
import com.algorand.scalgorand.v2.client.model.PendingTransactionResponse
import com.algorand.scalgorand.v2.client.model.PostTransactionsResponse
import com.algorand.scalgorand.transaction.Transaction
import org.json.JSONObject

class NoteField {

}


object NoteField {
  var client: AlgodClient = null
  //var client: Nothing = null

  def main(args: Array[String]): Unit = {
    connectToNetwork
    gettingStartedNoteFieldExample()
  }

  /**
   * Initialize an algod client
   */
  private def connectToNetwork = {
    val ALGOD_API_ADDR = "https://betanet-algorand.api.purestake.io/ps2"
    val ALGOD_PORT = 4001
    val ALGOD_API_TOKEN = "DyUkTm63a99BNgGMs0JDJ2uMFfJypX3Y7LzwyA7p"
    val client = new AlgodClient(ALGOD_API_ADDR, ALGOD_PORT, ALGOD_API_TOKEN)
    client
  }

  /**
   * note field example.
   */
  @throws[Exception]
  def gettingStartedNoteFieldExample(): Unit = {
    if (client == null) this.client = connectToNetwork
    // Import your private key mnemonic and address
    val PASSPHRASE = "patrol target joy dial ethics flip usual fatigue bulb security prosper brand coast arch casino burger inch cricket scissors shoe evolve eternal calm absorb school"
    System.out.println("Client Status:" + client.GetStatus)
    val myAccount = new Account()
    System.out.println("My Address: " + myAccount.getAddress)
    System.out.println("Account Mnemonic:" + myAccount.toMnemonic())

    //printBalance(myAccount)
    // Construct the transaction
    val RECEIVER = "L5EUPCF4ROKNZMAE37R5FY2T5DF2M3NVYLPKSGWTUKVJRUGIW4RKVPNPD4"
    // add some notes to the transaction
    val note = "showing prefix and more"
    //val txn = Transaction.PaymentTransactionBuilder.sender(myAccount.getAddress).noteUTF8(note).amount(100000).receiver(RECEIVER).lookupParams(client).build // query algod for firstValid, fee, etc

  }
}
