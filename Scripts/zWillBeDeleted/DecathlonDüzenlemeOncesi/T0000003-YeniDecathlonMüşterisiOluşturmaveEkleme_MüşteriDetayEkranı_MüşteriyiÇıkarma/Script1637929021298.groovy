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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

Mobile.startApplication('C:\\Users\\Hasan.Oral\\OneDrive - Logo\\Desktop\\app-DivaMobileSales-universal-release.apk', true)

CustomKeywords.'decathlon.Login.DecLogin'(username, password)

Mobile.verifyElementNotExist(findTestObject('zWillBeDeleted/Decathlon/T0000003/loginVerify(newscenerio3)'), 10)

//Mobile.verifyElementExist(findTestObject('zWillBeDeleted/Decathlon/T0000003/anaSayfaVerify'), 10)

'Müşteri ara\'ya bastık(ana ekrandaki)'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Home/MusteriAra'), 0)

Mobile.verifyElementExist(findTestObject('zWillBeDeleted/Decathlon/T0000003/verifyMusteriAraTusuPush'), 10)

'yeni müşteri oluşturuyoruz..'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000003/android.widget.TextView - Yeni Diva Mterisi Olutur'), 0)

//Mobile.verifyElementExist(findTestObject('zWillBeDeleted/Decathlon/T0000003/verifyYeniMsteri'), 10)

CustomKeywords.'com.test.randomData.newRandomUser.newUser'()

//Mobile.setText(findTestObject('zWillBeDeleted/Decathlon/T0000003/android.widget.EditText - Ad - Soyad'), 'hasann orall', 0)

//Mobile.setText(findTestObject('zWillBeDeleted/Decathlon/T0000003/android.widget.EditText - Email'), 'hsn99@gmail.com', 0)

//Mobile.setText(findTestObject('zWillBeDeleted/Decathlon/T0000003/android.widget.EditText - Telefon 1'), '234567890', 0)

'müşteriyi kaydettik ve otomatil satış listesine alındı'
//Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000003/android.widget.TextView - MTERY KAYDET VE SATI YAP'), 0)

'kişi ikonuna bastık(yeni kayıt edilen müşteriyi çıkarmak için)'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000003/profil_ikonu'), 0)

'"x" ikonuna bastık(müşteri isminin yanındaki)'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000003/android.widget.TextView -  (1)'), 0)

Mobile.verifyElementExist(findTestObject('zWillBeDeleted/Decathlon/T0000003/Mteriyikar'), 10)

'Müşteri satıştan çıkarıldı'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000003/android.widget.Button - EVET'), 0)

'kayıtlı müşteri ekleme aşaması'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000003/android.widget.TextView - MTER ARA'), 0)

Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000003/android.widget.TextView - Divada Ara'), 0)

Mobile.setText(findTestObject('zWillBeDeleted/Decathlon/T0000003/android.widget.EditText - Ara'), 'ceren', 0)

'kayıtlı müşteriyi seçtik.'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000003/android.widget.TextView - Sat Yap'), 0)

'müşteri detayına bakmak için profil ikonuna tıkladık.'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000003/profil_ikonu'), 0)

'satış listesine aldığımız müşteriyi çıkardık.'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000003/android.widget.TextView -  (2)'), 0)

Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000003/android.widget.Button - EVET'), 0)

CustomKeywords.'decathlon.Logout.goLogout'()

//Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000003/android.widget.ImageView'), 0)

//Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000003/android.widget.TextView - k Yap'), 0)

//Mobile.closeApplication()

