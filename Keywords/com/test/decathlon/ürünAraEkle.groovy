package com.test.decathlon

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

import internal.GlobalVariable

public class ürünAraEkle {

	@Keyword
	public void urunAra(String urun){
		Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/UrunArama/UrunAraButonu'), 0)

		Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/UrunArama/UrunİsmiAra'), urun , 0)
	}

	@Keyword
	public void urunAraEkle(String urun) {
		'ürün arama'
		Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000004-New/android.widget.TextView - RN ARA'), 0)

		'"poset" arattık'
		Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000004-New/android.widget.EditText - rn ara'), 'poset', 0)

		'+ butonu ile ürünü ekledik'
		Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000004-New/android.widget.TextView -'), 0)
	}
}
