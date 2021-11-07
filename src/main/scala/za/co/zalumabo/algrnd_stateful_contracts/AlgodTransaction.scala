package za.co.zalumabo.algrnd_stateful_contracts
//import com.algorand.algosdk.algod.client.AlgodClient
//import com.algorand.algosdk.kmd.client.{ApiException, KmdClient}
//import com.algorand.algosdk.kmd.client.api.KmdApi
//import com.algorand.algosdk.kmd.client.model._
//import com.algorand.algosdk.transaction.{SignedTransaction, Transaction}
//import com.algorand.algosdk.util.Encoder
//import com.algorand.algosdk.v2.client.common.IndexerClient

import java.io.IOException
import java.security.NoSuchAlgorithmException
import java.util


object AlgodTransaction {
  /*private val token = "DyUkTm63a99BNgGMs0JDJ2uMFfJypX3Y7LzwyA7p"
  private var kmd: KmdApi = null

  @throws[Exception]
  def main(args: Array[String]): Unit = { // Initialize algod/indexer v2 clients.
    val algod: AlgodClient = new AlgodClient("https://betanet-algorand.api.purestake.io/ps2", 4001, token)
    val indexer = new IndexerClient("https://betanet-algorand.api.purestake.io/idx2", 8980)
    // Initialize KMD v1 client
    val kmdClient = new KmdClient
    kmdClient.setBasePath("https://betanet-algorand.api.purestake.io")
    kmdClient.setApiKey(token)
    kmd = new KmdApi(kmdClient)
    // Get accounts from sandbox.
    val walletHandle = getDefaultWalletHandle
    val accounts = getWalletAccounts(walletHandle)
    // Create a payment transaction
    val tx1 = Transaction.PaymentTransactionBuilder.lookupParams(algod).sender // lookup fee, firstValid, lastValid
    accounts.get(0).receiver(accounts.get(1)).amount(1000000).noteUTF8("test transaction!").build
    // Sign with KMD
    val stx1a = signTransactionWithKMD(tx1, walletHandle)
    val stx1aBytes = Encoder.encodeToMsgPack(stx1a)
    // Sign with private key
    val privateKey = lookupPrivateKey(accounts.get(0), walletHandle)
    val account = new Nothing(privateKey)
    val stx1b = account.signTransaction(tx1)
    val stx1bBytes = Encoder.encodeToMsgPack(stx1b)
    // KMD and signing directly should both be the same.
    if (!util.Arrays.equals(stx1aBytes, stx1bBytes)) throw new RuntimeException("KMD disagrees with the manual signature!")
    // Send transaction
    val post = algod.RawTransaction.rawtxn(stx1aBytes).execute
    if (!post.isSuccessful) throw new RuntimeException("Failed to post transaction")
    // Wait for confirmation
    var done = false
    while ( {
      !done
    }) {
      val txInfo = algod.PendingTransactionInformation(post.body.txId).execute
      if (!txInfo.isSuccessful) throw new RuntimeException("Failed to check on tx progress")
      if (txInfo.body.confirmedRound != null) done = true
    }
    // Wait for indexer to index the round.
    Thread.sleep(5000)
    // Query indexer for the transaction
    val transactions = indexer.searchForTransactions.txid(post.body.txId).execute
    if (!transactions.isSuccessful) throw new RuntimeException("Failed to lookup transaction")
    System.out.println("Transaction received! \n" + transactions.toString)
  }

  @throws[IOException]
  @throws[ApiException]
  def signTransactionWithKMD(tx: Nothing, walletHandle: String): SignedTransaction = {
    val req = new SignTransactionRequest
    req.transaction(Encoder.encodeToMsgPack(tx))
    req.setWalletHandleToken(walletHandle)
    req.setWalletPassword("")
    val stxBytes = kmd.signTransaction(req).getSignedTransaction
    Encoder.decodeFromMsgPack(stxBytes, classOf[SignedTransaction])
  }

  @throws[ApiException]
  def lookupPrivateKey(addr: Nothing, walletHandle: String): Array[Byte] = {
    val req = new ExportKeyRequest
    req.setAddress(addr.toString)
    req.setWalletHandleToken(walletHandle)
    req.setWalletPassword("")
    kmd.exportKey(req).getPrivateKey
  }

  @throws[ApiException]
  def getDefaultWalletHandle: String = {
    for (w <- kmd.listWallets.getWallets) {
      if (w.getName == "unencrypted-default-wallet") {
        val tokenreq = new InitWalletHandleTokenRequest
        tokenreq.setWalletId(w.getId)
        tokenreq.setWalletPassword("")
        return kmd.initWalletHandleToken(tokenreq).getWalletHandleToken
      }
    }
    throw new RuntimeException("Default wallet not found.")
  }

  @throws[ApiException]
  @throws[NoSuchAlgorithmException]
  def getWalletAccounts(walletHandle: String): util.List[Nothing] = {
    val accounts = new util.ArrayList[Nothing]
    val keysRequest = new ListKeysRequest
    keysRequest.setWalletHandleToken(walletHandle)
    for (addr <- kmd.listKeysInWallet(keysRequest).getAddresses) {
      accounts.add(new Nothing(addr))
    }
    accounts
  }*/
}