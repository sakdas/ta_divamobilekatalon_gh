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

//Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.widget.EditText'), 'GSAY28', 0)

//Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.widget.EditText (1)'), 'decathlon', 0)

//Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.view.View - SGN ON'), 0)

CustomKeywords.'decathlon.Login.DecLogin'(username, password)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.widget.TextView - MTER ARA'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.view.ViewGroup'), 0)

Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.widget.EditText - Ara'), 'dummy88', 0)

'burayı sil'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.view.ViewGroup (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Decathlon/T0000008/android.widget.EditText - dummy88'), 'dummy89', 0)

/*Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.widget.EditText - TRKYE'), 0)

Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.widget.EditText - TRKYE (1)'), 'ENGLAND', 0)*/

Mobile.scrollToText('Email')

Mobile.setText(findTestObject('Object Repository/Decathlon/T0000008/android.widget.EditText - dummy88gmail.com'), 'dummy89@gmail.com', 
    0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.widget.EditText - sdjkgfsdfgjksdfgdf'), 'dgsfdssdjsdfgjksdfkjg', 
    0)

Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.widget.EditText - ANKARA'), 'BURSA', 0)

Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.widget.EditText - le'), 'MUDANYA', 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.widget.TextView - MTER BLGLERN GNCELLE'), 0)

/*'home ikonuna tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.widget.TextView -'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.widget.TextView - BURSA'), 0)

Mobile.tap(findTestObject(''), 0)*/

'müşteri güncelle geri butonu'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.widget.ImageView'), 0)

Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.widget.EditText - dummy (1)'), 'dummy88', 0)

'geri ikonuna tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.widget.ImageView (1)'), 0)

'geri ikonuna tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.widget.ImageView (2)'), 0)

'hamburger menu tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000008/android.widget.TextView - k Yap'), 0)

Mobile.closeApplication()

