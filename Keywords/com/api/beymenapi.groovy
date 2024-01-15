package com.api

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

public class beymenapi {
	@Keyword
	beymenApiLogin() {
		def loginresponse = WS.sendRequest(findTestObject('API/BeymenApi/BeymenApiLogin'))
		def slurper = new groovy.json.JsonSlurper()
		def loginresponseparsed = slurper.parseText(loginresponse.getResponseBodyContent());
		def beymenApiToken = loginresponseparsed.access_token
		def divaRetailApiToken = loginresponseparsed.divaRetailToken
		println(beymenApiToken)
		println(divaRetailApiToken);
		GlobalVariable.BeymenApiToken = 'Bearer ' + beymenApiToken
		GlobalVariable.DivaRetailApiBeymenToken = divaRetailApiToken
		println 'Global Variable BeymenApiToken is ' + GlobalVariable.BeymenApiToken
		println 'Global Variable DivaRetailApiBeymenToken is ' + GlobalVariable.DivaRetailApiBeymenToken
	}
}
