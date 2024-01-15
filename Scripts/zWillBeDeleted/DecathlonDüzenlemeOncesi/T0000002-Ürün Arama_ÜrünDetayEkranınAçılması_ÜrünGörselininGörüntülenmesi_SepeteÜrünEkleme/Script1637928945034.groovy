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

Mobile.startApplication('C:\\Users\\Hasan.Oral\\OneDrive - Logo\\Desktop\\app-universal-release.apk', true)

'login işlemi'

String id = "GSAY28"
String password = "decathlon"

CustomKeywords.'decathlon.Login.goLogin'(id, password)

Mobile.verifyElementNotExist(findTestObject('Decathlon/NewScenerio2.1/android.view.View - We didnt recognize the username or password you entered. Please try again'), 10)

'ürün arama işlemi'
Mobile.tap(findTestObject('Decathlon/NewScenerio2.1/android.widget.TextView - RN ARA'), 0)

Mobile.setText(findTestObject('Decathlon/NewScenerio2.1/android.widget.EditText - rn ara'), 'poset', 0)

Mobile.verifyElementExist(findTestObject('Decathlon/NewScenerio2.1/verifyArananUrn'), 10)

'ürün detaylarının görüntülenmesi'
Mobile.tap(findTestObject('Decathlon/NewScenerio2.1/android.widget.TextView - BUYUK POSET'), 0)


'ürün görselinin görüntülenmesi'
Mobile.tap(findTestObject('Decathlon/NewScenerio2.1/android.widget.ImageView'), 0)

'görseli verify edebilmek için tap işlemi yaptım(object repository\'e eklemek için)'
Mobile.verifyElementExist(findTestObject('Decathlon/NewScenerio2.1/android.view.ViewGroup'), 10)


'ürün görselinin kapatılması'
Mobile.tap(findTestObject('Decathlon/NewScenerio2.1/android.widget.TextView - '), 0)

'ürünü sepete ekledik'
Mobile.tap(findTestObject('Decathlon/NewScenerio2.1/android.widget.TextView - SEPETE EKLE'), 0)

'sepete gittik(sepet ikonuna tap)'
Mobile.tap(findTestObject('Decathlon/NewScenerio2.1/android.widget.TextView -  (1)'), 0)

'üç noktaya tap'
Mobile.tap(findTestObject('Decathlon/NewScenerio2.1/android.widget.TextView -  (2)'), 0)

'satışı askıya alma işlemi'
Mobile.tap(findTestObject('Decathlon/NewScenerio2.1/android.widget.TextView - Sat Askya Al'), 0)

Mobile.setText(findTestObject('Decathlon/NewScenerio2.1/android.widget.EditText - Mteri bilgisi'), 'hasanSenaryo2', 
    0)

Mobile.tap(findTestObject('Decathlon/NewScenerio2.1/android.widget.Button - ASKIYA AL'), 0)

CustomKeywords.'decathlon.Logout.goLogout'()

//Mobile.tap(findTestObject('Decathlon/NewScenerio2.1/android.widget.ImageView (1)'), 0)

//Mobile.tap(findTestObject('Decathlon/NewScenerio2.1/android.widget.TextView - k Yap'), 0)

//Mobile.closeApplication()

