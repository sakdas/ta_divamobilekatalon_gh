import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.SetUp as SetUp
import com.kms.katalon.core.annotation.TearDown as TearDown
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WS.sendRequestAndVerify(findTestObject('API/BeymenApi/BeymenApiSaveVoucher' // Please change skipped to be false to activate this method.
        ))

Mobile.startApplication('D:\\tmp\\app-DivaMobileSales-release.apk', false)

Mobile.tap(findTestObject('Mobile/Intro/android.widget.DivaRetailUrlTxt'), 2)

Mobile.setText(findTestObject('Mobile/Intro/android.widget.DivaRetailUrlTxt'), GlobalVariable.BeymenDRURL, 2)

Mobile.tap(findTestObject('Mobile/Intro/android.widget.HomeContinue'), 2)

Mobile.setText(findTestObject('Mobile/LoginPage/android.widget.Username'), '77719', 2)

Mobile.setText(findTestObject('Mobile/LoginPage/android.widget.Password'), '1', 2)

Mobile.tap(findTestObject('Mobile/LoginPage/android.view.LoginButton'), 4)

Mobile.tap(findTestObject('Mobile/Home/android.widget.Top.InvoiceQueueBtn'), 3)

Mobile.tap(findTestObject('Mobile/Cart/android.view.AskiNesne1'), 2)

Mobile.tap(findTestObject('Mobile/Cart/android.view.AskiNesne1'), 2)

Mobile.tap(findTestObject('Mobile/CartQueue/android.view.RecallFromHoldBtn'), 2)

Mobile.tap(findTestObject('Mobile/CartQueue/android.widget.RecallFromHoldConfirmBtn'), 2)

Mobile.tap(findTestObject('Mobile/Cart/android.widget.CartConfirmCartBtn'), 2)

Mobile.tap(findTestObject('Mobile/Payment/android.view.PaymentBeymenIMFBtn'), 2)

Mobile.tap(findTestObject('Mobile/Payment/BeymenIMF/android.widget.SetManualQR'), 2)

Mobile.setText(findTestObject('Mobile/Payment/BeymenIMF/android.widget.SetManualQRCodeText'), '1234', 1)

Mobile.tap(findTestObject('Mobile/Payment/BeymenIMF/android.view.ConfirmManualQRBtn'), 2)

Mobile.setText(findTestObject('Mobile/Payment/BeymenIMF/android.widget.SetSMSOTPCodeText'), '4321', 1)

Mobile.tap(findTestObject('Mobile/Payment/BeymenIMF/android.view.ConfirmSMSTOPCodeBtn'), 2 //Mobile.closeApplication()
    //Mobile.closeApplication()
    )

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile/Payment/android.view.PaymentAcceptBtn'), 2)

Mobile.tap(findTestObject('Mobile/Payment/android.widget.PaymentAcceptedConfirmBtn'), 2)

Mobile.tap(findTestObject('Mobile/Payment/android.view.PaymentCompleteSaleBtn'), 5)

Mobile.tap(findTestObject('Mobile/Payment/android.view.GoToDivaHomeBtn'), 5)

Mobile.verifyElementVisible(findTestObject('Mobile/Home/android.view.SearchCustomerBtn'), 2)

Mobile.closeApplication()

@SetUp(skipped = false)
def setUp() {
    CustomKeywords.'com.api.beymenapi.beymenApiLogin'()

    def randomID = CustomKeywords.'com.test.randomData.generateRandomData.generateRandomID'()

    GlobalVariable.BeymenSalesInvoiceExtRef = randomID

    println('generated BeymenSalesInvoiceExtRef: ' + GlobalVariable.BeymenSalesInvoiceExtRef)

    GlobalVariable.VoucherDateTime = CustomKeywords.'com.toolkit.toolkit.getCurrentDateTime'()

    println('Setup - GV VoucherDateTime: ' + GlobalVariable.VoucherDateTime)

    println('Setup - GV BeymenApiToken: ' + GlobalVariable.BeymenApiToken)

    println('Setup - GV DivaRetailApiBeymenToken: ' + GlobalVariable.DivaRetailApiBeymenToken)
}

@TearDown(skipped = true)
def tearDown() {
}

