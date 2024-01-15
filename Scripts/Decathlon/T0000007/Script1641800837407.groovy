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

Mobile.setText(findTestObject('zWillBeDeleted/Decathlon/T0000007/android.widget.EditText'), 'GSAY28', 0)

Mobile.setText(findTestObject('zWillBeDeleted/Decathlon/T0000007/android.widget.EditText (1)'), 'decathlon', 0)

Mobile.tap(findTestObject('zWillBeDeleted/LoginObjects/SignOnButton'), 0)

'prfil ikonuna tap'
Mobile.tap(findTestObject('zWillBeDeleted/Home/MusteriSekmesi'), 0)

Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000007/android.widget.TextView - Divada Ara'), 0)

Mobile.setText(findTestObject('zWillBeDeleted/Decathlon/T0000007/android.widget.EditText - Ara'), 'Hasan', 0)

Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000007/android.widget.TextView - Sat Yap'), 0)

'home ikonuna tap'
Mobile.tap(findTestObject('zWillBeDeleted/Home/HomeSimgesi'), 0)

'bunu da home page\'e eklemesini yap'
Mobile.tap(findTestObject('zWillBeDeleted/Home/MusteriAra'), 0)

Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000007/android.widget.TextView - Decathlon'), 0)

Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000007/android.widget.TextView - Decathlonda Ara'), 0)

Mobile.setText(findTestObject('zWillBeDeleted/Decathlon/T0000007/android.widget.EditText - E-posta  Kart No giriniz'), 'ccc@aaa.df', 
    0)

Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000007/android.widget.TextView - Ara'), 0)

'profil ikonuna tap'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000007/android.widget.TextView - (2)'), 0)

'müşteriyi çıkarıyoruz(diva)'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000007/android.widget.TextView - (3)'), 0)

Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000007/android.widget.Button - EVET'), 0)

Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000007/android.widget.TextView - Decathlon (1)'), 0)

'decathlon müşterisini çıkarıyoruz'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000007/android.widget.TextView - (4)'), 0)

Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000007/android.widget.Button - EVET'), 0)

'home ikonuna tap'
Mobile.tap(findTestObject('zWillBeDeleted/Home/HomeSimgesi'), 0)

'hamburger menuye tap'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000007/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000007/android.widget.TextView - k Yap'), 0)

Mobile.closeApplication()

