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

Mobile.startApplication('C:\\Users\\Hasan.Oral\\OneDrive - Logo\\Desktop\\1101_decahtlon.apk', true)

CustomKeywords.'decathlon.Login.DecLogin'(username, password)

/*Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.EditText'), 'GSAY28', 0)

Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.EditText (1)'), 'decathlon', 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.view.View - SIGN ON'), 0)*/

'müşteri ara\'ya tap işlemi '
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Home/MusteriAra'), 0)

'yeni diva müşterisi oluştur tap'
Mobile.tap(findTestObject('zWillBeDeleted/MusteriArama/YeniDivaMüsterisiOlustur'), 0)

CustomKeywords.'com.test.randomData.newRandomUser.newUser'()

/*Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.EditText - Firma Ad'), 'irmak a.s', 
    0)

Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.EditText - Vergi Numaras'), '9229710599', 
    0)

Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.EditText - Vergi Dairesi'), 'IZNIK', 
    0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.TextView - IZNIK VERG DARES MDRL'), 0)

'uyruk girildi-alttaki seçenekten bir sonraki adımda seçildi(TAP ile).'
Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.EditText - Uyruk'), 'türkiye', 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.TextView - TRKYE'), 0)

Mobile.scrollToText('Ülke')

'e-mail girildi'
Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.EditText - Email'), 'irmaklogo@gmail.com', 
    0)

'il girildi-alttaki seçenekten bir sonraki adımda seçildi(TAP ile).'
Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.EditText - ehir'), 'BURSA', 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.TextView - BURSA'), 0)

'ilçe girildi-alttaki seçenekten bir sonraki adımda seçildi(TAP ile).'
Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.EditText - le'), 'MUDANYA', 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.TextView - MUDANYA'), 0)

'adres girildi'
Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.EditText - Adres Detay'), 'askdhashdkasjhda', 
    0)

Mobile.scrollToText('Cep Telefonu')

'tel.no girildi'
Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.EditText - 5XXXXXXXXX'), '5443213445', 
    0)

'müşteri eklemesi yapıldı'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.TextView - MTERY KAYDET VE SATI YAP'), 0)*/

'müşteri sekmesine tap işlemi'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Home/MusteriSekmesi'), 0)

'müşteri ismi yanındaki küçük çarpıya tap'
Mobile.tap(findTestObject('zWillBeDeleted/MusteriArama/MüsteriCikarmaButonu'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.Button - EVET'), 0)

'home sekmesine tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Home/HomeSimgesi'), 0)

'hamburger menuye tap'

CustomKeywords.'decathlon.Logout.goLogout'()



