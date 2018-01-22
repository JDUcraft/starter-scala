import org.scalatest._

class BankAccountSpec extends FlatSpec with Matchers {
  "BankAccount balance" should "be 0 at start" in {
    new BankAccount().balance() should equal(0)
  }
}

class BankAccount {
  def balance(): Int = 0
}