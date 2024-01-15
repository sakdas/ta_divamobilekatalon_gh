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

Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/T0000008/android.widget.EditText'), 'GSAY28', 0)

Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/T0000008/android.widget.EditText (1)'), 'decathlon', 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/T0000008/android.view.View - SIGN ON'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/T0000008/android.widget.TextView - MTER ARA'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/T0000008/android.widget.TextView - Divada Ara'), 0)

Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/T0000008/android.widget.EditText - Ara'), 'dummy', 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/T0000008/android.view.ViewGroup'), 0)

Mobile.setText(findTestObject('Object Repository/T0000008/android.widget.EditText - dummy89'), 'dummy999', 0)

Mobile.setText(findTestObject('Object Repository/T0000008/android.widget.EditText - dummy89@gmail.com'), 'dummy999@gmail.com', 
    0)


Mobile.scrollToText('ADRES BİLGİLERİ')

Mobile.setText(findTestObject('Object Repository/T0000008/android.widget.EditText - asdfghjklşiqwertyuı'), 'hasanoralhasanoralhasanoral', 
    0)

Mobile.setText(findTestObject('Object Repository/T0000008/android.widget.EditText - ANKARA'), 'BURSA', 0)

Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/T0000008/android.widget.EditText - le'), 'MUDANYA', 0)

Mobile.scrollToText('Cep Telefonu')

Mobile.setText(findTestObject('Object Repository/T0000008/android.widget.EditText - 5426959068'), '54186648899', 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/T0000008/android.widget.TextView - MTER BLGLERN GNCELLE'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/T0000008/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/T0000008/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/T0000008/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/T0000008/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/T0000008/android.widget.TextView - k Yap'), 0)

Mobile.closeApplication()

