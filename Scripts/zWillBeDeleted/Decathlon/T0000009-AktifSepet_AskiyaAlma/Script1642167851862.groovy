import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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

Mobile.startApplication('C:\\Users\\Hasan.Oral\\OneDrive - Logo\\Desktop\\app-DivaMobileSales-universal-release.apk', true)

CustomKeywords.'decathlon.Login.DecLogin'(username, password)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.TextView - RN ARA'), 0)

'müşterisiz aktif sepeti askıya alma'
Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.EditText - rn ara'), 'poset', 0)

'+butonuna tap(ürün yanındaki)'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.TextView -'), 0)

'ödeme ikonuna tap'
Mobile.tap(findTestObject('zWillBeDeleted/Home/PaymentSekmesi'), 0)

'paymentPage obj.repine bu kısmı ekle'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.TextView - LEME KASADA DEVAM ET'), 0)

Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.EditText - Mteri bilgisi'), 'deneme', 
    0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.Button - ASKIYA AL'), 0)

'müşterili aktif sepeti askıya alma'
CustomKeywords.'customer.Customer.SearchCustomer'(searchText)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.TextView - Sat Yap'), 0)

'sepet sekmesindeki ürün ekleye tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.view.ViewGroup (1)'), 0)

Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.EditText - rn ara (1)'), 'poset', 0)

'+butonuna tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.TextView - (3)'), 0)

'ödeme sekmesine tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.TextView - (4)'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.TextView - LEME KASADA DEVAM ET'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.Button - ASKIYA AL (1)'), 0)

'askı ikonuna tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.ImageView'), 0)

'askıdaki ürünleri iptal etme'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.view.ViewGroup (3)'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.Button - ASKIDAN AIR'), 0)

'üç nokta simgesine tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.TextView - (5)'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.TextView - Sat ptal Et'), 0)

'satışı iptal ettik'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.Button - TAMAM'), 0)

'askı simgesine tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.TextView - ASKIDAN AIR'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.Button - ASKIDAN AIR'), 0)

'üç nokta simgesine tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.TextView - (5)'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.TextView - Sat ptal Et'), 0)

'satışı iptal ettik'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.Button - TAMAM'), 0)

'hamburger menuye tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.ImageView (1)'), 0)

'logout'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000009/android.widget.TextView - k Yap'), 0)

Mobile.closeApplication()

