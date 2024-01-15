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
// Random data generator: https://github.com/DiUS/java-faker
import com.github.javafaker.Faker;

import internal.GlobalVariable

public class generateRandomData {

	Faker faker = new Faker(new Locale("tr"))
	@Keyword
	def generateRandomName() {
		String randomName = faker.name().firstName();
		return randomName
	}

	@Keyword
	def generateRandomSurname() {
		String randomSurname = faker.name().lastName();
		return randomSurname
	}

	@Keyword
	def generateRandomNameSurname() {
		String randomNameSurname = generateRandomName() + " " + generateRandomSurname()
		return randomNameSurname
	}

	@Keyword
	def getRandomString(int len) {
		def charSet = ('ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789' as char[]).toList()
		def rnd = new Random()
		return (0..<len).collect { charSet[rnd.nextInt(charSet.size())] }.join()
	}

	@Keyword
	def generateRandomID() {
		def randomString = getRandomString(8) // Generates 8 characters
		def uuid = UUID.randomUUID().toString().toUpperCase() // Generates a random UUID
		return "${randomString.substring(0, 2)}${uuid.substring(0, 8)}-${uuid.substring(9, 13)}-${uuid.substring(14, 16)}"
	}
}

