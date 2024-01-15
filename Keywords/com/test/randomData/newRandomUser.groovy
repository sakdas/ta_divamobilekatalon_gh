package com.test.randomData

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import com.thedeanda.lorem.Lorem as Lorem
import com.thedeanda.lorem.LoremIpsum as LoremIpsum

import internal.GlobalVariable

public class newRandomUser {

	@Keyword
	public void newUser() {

		boolean yeniKayit = Mobile.verifyElementExist(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.EditText - Firma Ad'),
				10)

		Lorem lorem = LoremIpsum.getInstance()

		if (yeniKayit == true) {
			String isim = lorem.getFirstName().replaceAll('[^a-zA-Z]+', '')

			String soyisim = lorem.getLastName().replaceAll('[^a-zA-Z]+', '')

			String firma_isim = (isim + ' ') + soyisim + ' ' + 'A.S'

			Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.EditText - Firma Ad'), firma_isim , 0)

			Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.EditText - Vergi Numaras'), '9229710599',
					0)

			Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.EditText - Vergi Dairesi'), 'IZNIK',
					0)

			Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.TextView - IZNIK VERG DARES MDRL'), 0)

			Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.EditText - Uyruk'), 'türkiye', 0)

			Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.TextView - TRKYE'), 0)

			Mobile.scrollToText('Ülke')

			int RN2

			RN2 = ((Math.random() * 500) as int)

			String str2 = RN2

			String email = (isim + RN2) + '@gmail.com'

			Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.EditText - Email'), email, 0)

			Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.EditText - ehir'), 'BURSA', 0)

			Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.TextView - BURSA'), 0)

			'ilçe girildi-alttaki seçenekten bir sonraki adımda seçildi(TAP ile).'
			Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.EditText - le'), 'MUDANYA', 0)

			Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.TextView - MUDANYA'), 0)

			'adres girildi'
			Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.EditText - Adres Detay'), 'askdhashdkasjhda',
					0)

			Mobile.scrollToText('Cep Telefonu')

			int RN3

			RN3 = ((Math.random() * 999999999) as int)

			String str3 = '5' + RN3

			Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.EditText - 5XXXXXXXXX'), str3, 0)

			Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000011/android.widget.TextView - MTERY KAYDET VE SATI YAP'), 0)
		} else {
			Mobile.comment('Yeni Kayıt girişi hatalı oldu!')
		}
	}
}
