import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WebsiteTest extends BeforTest{
	// TestOne
	//please change the email  
		@Test(priority = 1)
		public void SignUpTest() throws InterruptedException {
	        Thread.sleep(6000);
			driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[3]/a")).click();
			driver.findElement(By.id("firstname")).sendKeys("Rawand");
			driver.findElement(By.id("lastname")).sendKeys("Alturk");
			driver.findElement(By.id("email_address")).sendKeys("mohammadrawand303@gmail.com");
			driver.findElement(By.id("password")).sendKeys("97723RAwand*$");
			driver.findElement(By.id("password-confirmation")).sendKeys("97723RAwand*$");
			driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();
			Thread.sleep(4000);
			MyAssertion.assertEquals(
					driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div")).isDisplayed(), true);
			MyAssertion.assertAll();
		}
		// TestTwo

		@Test(priority = 2)
		public void SearchBarRandomly() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			WebElement HomePage = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img"));
			HomePage.click();
			Thread.sleep(2000);
			String SearchClothes[] = { "Jacket", "t-shirt", "jeans for men", "jeans for women", "pants" };
			Random rand = new Random();
			int RandomSearchForClothes = rand.nextInt(5);
			driver.findElement(By.id("search")).sendKeys(SearchClothes[RandomSearchForClothes] + Keys.ENTER);
			System.out.println("The selected item for search :" + SearchClothes[RandomSearchForClothes]);
		}
		// TestThree
		@Test(priority = 3)
		public void Add5HotSellersItems() throws InterruptedException {
			WebElement HomePage = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img"));
			HomePage.click();
			// Add Radiant tee - 3 items
			for (int i = 0; i < 3; i++) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

				WebElement DivSize = driver.findElement(By.xpath(
						"//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[1]/div/div/div[3]/div[1]/div"));
				List<WebElement> AllSizes = DivSize.findElements(By.tagName("div"));
				WebElement DivColor = driver.findElement(By.xpath(
						"//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[1]/div/div/div[3]/div[2]/div"));
				List<WebElement> AllColors = DivColor.findElements(By.tagName("div"));
				WebElement AddToCart = driver.findElement(By.xpath(
						"//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[1]/div/div/div[4]/div/div[1]/form/button"));
				Random rand = new Random();
				int RandomSize = rand.nextInt(AllSizes.size());
				int RandomColor = rand.nextInt(AllColors.size());

				AllSizes.get(RandomSize).click();
				AllColors.get(RandomColor).click();
				Thread.sleep(2000);
				AddToCart.click();
			}

//			  add breathe- easy tank - 2 items
			for (int i = 0; i < 2; i++) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				WebElement DivSize = driver.findElement(By.xpath(
						"//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[2]/div/div/div[3]/div[1]/div"));
				List<WebElement> AllSizes = DivSize.findElements(By.tagName("div"));
				WebElement DivColor = driver.findElement(By.xpath(
						"//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[2]/div/div/div[3]/div[2]/div"));
				List<WebElement> AllColors = DivColor.findElements(By.tagName("div"));
				WebElement AddToCart = driver.findElement(By.xpath(
						"//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[2]/div/div/div[4]/div/div[1]/form/button/span"));
				Random rand = new Random();
				int RandomSize = rand.nextInt(AllSizes.size());
				int RandomColor = rand.nextInt(AllColors.size());
				AllSizes.get(RandomSize).click();
				AllColors.get(RandomColor).click();
				Thread.sleep(2000);
				AddToCart.click();
			}

//			 //Add argus all weather tank - 4 items
			for (int i = 0; i < 4; i++) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

				WebElement DivSize = driver.findElement(By.xpath(
						"//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[3]/div/div/div[2]/div[1]/div"));
				List<WebElement> AllSizes = DivSize.findElements(By.tagName("div"));
				WebElement DivColor = driver.findElement(By.xpath(
						"//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[3]/div/div/div[2]/div[2]/div"));
				List<WebElement> AllColors = DivColor.findElements(By.tagName("div"));
				WebElement AddToCart = driver.findElement(By.xpath(
						"//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[3]/div/div/div[3]/div/div[1]/form/button/span"));
				Random rand = new Random();
				int RandomSize = rand.nextInt(AllSizes.size());
				int RandomColor = rand.nextInt(AllColors.size());
				AllSizes.get(RandomSize).click();
				AllColors.get(RandomColor).click();
				Thread.sleep(2000);
				AddToCart.click();
			}

			// Add hero hoodie - 1 item
			for (int i = 0; i < 1; i++) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

				WebElement DivSize = driver.findElement(By.xpath(
						"//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[4]/div/div/div[2]/div[1]/div"));
				List<WebElement> AllSizes = DivSize.findElements(By.tagName("div"));
				WebElement DivColor = driver.findElement(By.xpath(
						"//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[4]/div/div/div[2]/div[2]/div"));
				List<WebElement> AllColors = DivColor.findElements(By.tagName("div"));
				WebElement AddToCart = driver.findElement(By.xpath(
						"//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[4]/div/div/div[3]/div/div[1]/form/button/span"));
				Random rand = new Random();
				int RandomSize = rand.nextInt(AllSizes.size());
				int RandomColor = rand.nextInt(AllColors.size());

				AllSizes.get(RandomSize).click();
				AllColors.get(RandomColor).click();
				Thread.sleep(2000);
				AddToCart.click();
			}
			// add fusion backpack 5 items

			for (int i = 0; i < 1; i++) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				driver.findElement(
						By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[5]/div/a/span/span/img"))
						.click();
				driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("5");
				driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();

			}

		}

//		TestFour
		@Test(priority = 4)
		public void FinishShippingProcess() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img")).click();
			driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a/span[2]/span[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]")).click();
			Thread.sleep(4000);
			WebElement StreetAdressInput = driver.findElement(By.xpath("//*[@id=\"shipping-new-address-form\"]/fieldset"));
			List<WebElement> StreetAdress = StreetAdressInput.findElements(By.tagName("input"));
			StreetAdress.get(0).sendKeys("Jordan");
			StreetAdress.get(1).sendKeys("Blqa'a");
			StreetAdress.get(2).sendKeys("60 street");
			WebElement CityInput = driver.findElement(By.xpath("//*[@id=\"shipping-new-address-form\"]/div[4]/div"));
			List<WebElement> City = CityInput.findElements(By.tagName("input"));
			City.get(0).sendKeys("Balqa'a");
			WebElement StateInput = driver
					.findElement(By.xpath("//div[@name='shippingAddress.region_id']//div[@class='control']"));
			List<WebElement> State = StateInput.findElements(By.tagName("select"));
			Select MySelectForState = new Select(State.get(0));
			MySelectForState.selectByIndex(10);
			WebElement PostalCodeInput = driver.findElement(By.xpath("//*[@id=\"shipping-new-address-form\"]/div[7]/div"));
			List<WebElement> PostalCode = PostalCodeInput.findElements(By.tagName("input"));
			PostalCode.get(0).sendKeys("19110");
			WebElement CountryInput = driver.findElement(By.xpath("//*[@id=\"shipping-new-address-form\"]/div[8]"));
			List<WebElement> Country = CountryInput.findElements(By.tagName("select"));
			Select MySelectForCountry = new Select(Country.get(0));
			MySelectForCountry.selectByValue("JO");
			WebElement PhoneNumberInput = driver.findElement(By.xpath("//*[@id=\"shipping-new-address-form\"]/div[9]/div"));
			List<WebElement> PhoneNumber = PhoneNumberInput.findElements(By.tagName("input"));
			PhoneNumber.get(0).sendKeys("0788375246");
			WebElement ShippingMethodInputs = driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]"));
			List<WebElement> ShippingMethod = ShippingMethodInputs.findElements(By.tagName("input"));
			Thread.sleep(6000);
//			ShippingMethod.get(0).click();
			WebElement NextButton = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div"));
			List<WebElement> Next = NextButton.findElements(By.tagName("span"));
			Next.get(0).click();
			Thread.sleep(4000);
		}

		@Test(priority = 5)
		public void CompleteShippingPrecess() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
			Thread.sleep(3000);
			WebElement CartSubTotal = driver
					.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[1]/td/span"));
			String CartSubTotalBill = CartSubTotal.getText();
			String CartSubTotalAfterReplace = CartSubTotalBill.replace("$", "");
			String CartSubTotalBillAfterSecondReplace = CartSubTotalAfterReplace.replace(".", "");
			int ActualCartSubTotal = Integer.parseInt(CartSubTotalBillAfterSecondReplace);
			WebElement Discount = driver.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[2]/td/span"));
			String DiscountBill = Discount.getText();
			String DiscountAfterReplace = DiscountBill.replace("$", "");
			String DiscountAfterSecondReplace = DiscountAfterReplace.replace(".", "");
			String DiscountAfterThirdReplace = DiscountAfterSecondReplace.replace("-", "");
			int ActualDiscount = Integer.parseInt(DiscountAfterThirdReplace);
			WebElement Shipping = driver.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[3]/td/span"));
			String ShippingBill = Shipping.getText();
			String ShippingAfterReplace = ShippingBill.replace("$", "");
			String ShippingAfterSecondReplace = ShippingAfterReplace.replace(".", "");
			int ActualShipping = Integer.parseInt(ShippingAfterSecondReplace);
			WebElement OrderTotal = driver
					.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[4]/td/strong/span"));
			String TotalBill = OrderTotal.getText();
			String TotalBillAfterReplace = TotalBill.replace("$", "");
			String TotalBillAfterSecondReplace = TotalBillAfterReplace.replace(",", "");
			String TotalBillAfterThirdReplace = TotalBillAfterSecondReplace.replace(".", "");
			int ActualTotalBill = Integer.parseInt(TotalBillAfterThirdReplace);
			System.out.println("ActualCartSubTotal = " + ActualCartSubTotal);
			System.out.println("ActualDiscount = " + ActualDiscount);
			System.out.println("ActualShipping = " + ActualShipping);
			int ExpectedTotalBill = ActualCartSubTotal - ActualDiscount + ActualShipping;
			MyAssertion.assertEquals(ActualTotalBill, ExpectedTotalBill);
			MyAssertion.assertAll();
			Thread.sleep(5000);
			WebElement PlaceOrderDiv = driver
					.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div"));
			List<WebElement> PlaceOrder = PlaceOrderDiv.findElements(By.tagName("span"));
			PlaceOrder.get(0).click();

		}

		@Test(priority = 6)
		public void ReorderTest() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
			Thread.sleep(4000);
			for (int i = 0; i < 5; i++) {
				Thread.sleep(5000);
				WebElement HeaderButtonHasMyAccount = driver.findElement(By.className("customer-name"));
				List<WebElement> GoToMyAccountButton = HeaderButtonHasMyAccount.findElements(By.tagName("button"));
				GoToMyAccountButton.get(0).click();
				Thread.sleep(2000);
				WebElement MyAccountButton = driver
						.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a"));
				MyAccountButton.click();
				Thread.sleep(4000);
				WebElement ReOrderButton = driver
						.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr/td[6]/a[2]/span"));
				ReOrderButton.click();
				WebElement ProceedToCheckOutButton = driver
						.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button"));
				List<WebElement> ProceedToCheckOut = ProceedToCheckOutButton.findElements(By.tagName("span"));
				ProceedToCheckOut.get(0).click();
//			driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button/span")).click();
				Thread.sleep(4000);
				WebElement NextButton = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div"));
				List<WebElement> Next = NextButton.findElements(By.tagName("span"));
				Next.get(0).click();
				Thread.sleep(4000);
				WebElement PlaceOrderButton = driver.findElement(
						By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button"));
				List<WebElement> PlaceOrder = PlaceOrderButton.findElements(By.tagName("span"));
				PlaceOrder.get(0).click();
			}
			WebElement HomePage = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img"));
			HomePage.click();
		}

		@Test(priority = 7)
		public void AssertPrice() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebElement HeaderButtonHasMyAccount = driver.findElement(By.className("customer-name"));
			List<WebElement> GoToMyAccountButton = HeaderButtonHasMyAccount.findElements(By.tagName("button"));
			GoToMyAccountButton.get(0).click();
			Thread.sleep(4000);
			WebElement MyAccountButton = driver
					.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a"));
			MyAccountButton.click();
			WebElement Order1Price = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[1]/td[4]/span"));
			String Order1Pricetext = Order1Price.getText();
			String Order1PricetextAfterReplace = Order1Pricetext.replace("$", "");
			String Order1PricetextAfterSecondReplace = Order1PricetextAfterReplace.replace(".", "");
			int ActualOrder1Price = Integer.parseInt(Order1PricetextAfterSecondReplace);
			Thread.sleep(3000);
			WebElement Order2Price = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[2]/td[4]/span"));
			String Order2Pricetext = Order2Price.getText();
			String Order2PricetextAfterReplace = Order2Pricetext.replace("$", "");
			String Order2PricetextAfterSecondReplace = Order2PricetextAfterReplace.replace(".", "");
			int ActualOrder2Price = Integer.parseInt(Order2PricetextAfterSecondReplace);
			Thread.sleep(3000);
			WebElement Order3Price = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[3]/td[4]/span"));
			String Order3Pricetext = Order3Price.getText();
			String Order3PricetextAfterReplace = Order3Pricetext.replace("$", "");
			String Order3PricetextAfterSecondReplace = Order3PricetextAfterReplace.replace(".", "");
			int ActualOrder3Price = Integer.parseInt(Order3PricetextAfterSecondReplace);
			Thread.sleep(3000);
			WebElement Order4Price = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[4]/td[4]/span"));
			String Order4Pricetext = Order4Price.getText();
			String Order4PricetextAfterReplace = Order4Pricetext.replace("$", "");
			String Order4PricetextAfterSecondReplace = Order4PricetextAfterReplace.replace(".", "");
			int ActualOrder4Price = Integer.parseInt(Order4PricetextAfterSecondReplace);
			Thread.sleep(3000);
			WebElement Order5Price = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[5]/td[4]/span"));
			String Order5Pricetext = Order5Price.getText();
			String Order5PricetextAfterReplace = Order5Pricetext.replace("$", "");
			String Order5PricetextAfterSecondReplace = Order5PricetextAfterReplace.replace(".", "");
			int ActualOrder5Price = Integer.parseInt(Order5PricetextAfterSecondReplace);
			Thread.sleep(3000);
			int ThePriceForFiveOrders[] = { ActualOrder1Price, ActualOrder2Price, ActualOrder3Price, ActualOrder4Price,
					ActualOrder5Price };
			int TheActualPriceForFiveOrders[] = { ActualOrder1Price, ActualOrder1Price, ActualOrder1Price,
					ActualOrder1Price, ActualOrder1Price };
			MyAssertion.assertEquals(TheActualPriceForFiveOrders, ThePriceForFiveOrders);
			MyAssertion.assertAll();

		}
}
