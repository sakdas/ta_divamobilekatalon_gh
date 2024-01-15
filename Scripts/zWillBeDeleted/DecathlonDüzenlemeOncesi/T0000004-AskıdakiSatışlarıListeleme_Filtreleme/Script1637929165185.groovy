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

'login'
//Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/android.view.View - Username'), 0)

//Mobile.setText(findTestObject('Decathlon/NewScenerio4.2/android.widget.EditText'), 'GSAY28', 0)

//Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/android.view.View - Password'), 0)

//Mobile.setText(findTestObject('Decathlon/NewScenerio4.2/android.widget.EditText (1)'), 'decathlon', 0)

//Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/android.widget.Button - SIGN ON '), 0)

String isim = "GSAY28"
String password = "decathlon"
String urun = "mont"

CustomKeywords.'decathlon.Login.goLogin'(isim,password)

CustomKeywords.'com.test.decathlon.ürünAraEkle.urunAraEkle'(urun)

//Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/android.widget.TextView - RN ARA'), 0)

//Mobile.setText(findTestObject('Decathlon/NewScenerio4.2/android.widget.EditText - rn ara'), 'mont', 0)

//Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/android.widget.TextView - '), 0)

'Random Seri Numarası Girme'
/*boolean flag = Mobile.verifyElementExist(findTestObject('Decathlon/NewScenerio4.2/android.widget.EditText - rn Seri Numaras'),
	10)

if (flag == true) {
	int RN

	RN = ((Math.random() * 999999) as int)

	String str = RN

	Mobile.setText(findTestObject('Decathlon/NewScenerio4.2/android.widget.EditText - rn Seri Numaras'), str, 0)

	Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/android.widget.Button - SEPETE EKLE'), 0)

	'sepet ikonuna tap'
	Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/android.widget.TextView -  (1)'), 0)
} else {
	Mobile.comment('ID girişi hatalı oldu!')
}*/

CustomKeywords.'com.test.random.randomVars.randomSerialNumber'()

'üç nokta tap işlemi'
Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/android.widget.TextView -  (2)'), 0)

'satış askıya alındı'
Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/android.widget.TextView - Sat Askya Al'), 0)

Mobile.setText(findTestObject('Decathlon/NewScenerio4.2/android.widget.EditText - Mteri bilgisi'), 'hhasanDeneme', 
    0)

'askıya alındı'
Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/android.widget.Button - ASKIYA AL'), 0)

'askıdaki ürünler ikonuna tap'
Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/android.widget.ImageView'), 0)

'filtre ikonuna tap'
Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/android.widget.TextView -  (3)'), 0)

//Son 1 saate çevirmeyi unutma!!
//Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/FilterOptionAll'), 0)

'filtrelendi'
Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/android.widget.TextView - Filtreleri Uygula'), 0)

Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/android.widget.TextView - hhasanDeneme'), 0)

Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/android.widget.TextView - ASKIDAN AIR'), 0)

'askıdan çağırıldı'
Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/android.widget.Button - ASKIDAN AIR'), 0)

Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/android.widget.TextView - SEPET ONAYLA'), 0)

Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/android.widget.TextView - LEME KASADA DEVAM ET'), 0)

Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/askiyaAlButton'), 0)

'geri gitme ikonu tap'
Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Decathlon/NewScenerio4.2/android.widget.ImageView (2)'), 0)

CustomKeywords.'decathlon.Logout.goLogout'()

