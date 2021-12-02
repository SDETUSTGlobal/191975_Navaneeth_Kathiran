
import time

from behave import*
from selenium import webdriver

@given('I go to 4davanceboy to add item')
def launchbrowser(context):
   context.driver=webdriver.Chrome(executable_path="C:/Users/Guest_PC/Downloads/chromedriver_win32/chromedriver.exe")
   context.driver.get("https://lambdatest.github.io/sample-todo-app/")

@then('I Click on first checkbox and second checkbox')
def clickcheckbox(context):
    time.sleep(2)
    context.driver.find_element_by_name('li1').click()
    time.sleep(2)
    context.driver.find_element_by_name('li2').click()

@when('I enter item to add')
def enteritem(context):
    time.sleep(2)
    context.driver.find_element_by_id('sampletodotext').send_keys("Yey, Let's add it to list")

@when('I click add button')
def clickadd(context):
    time.sleep(2)
    context.driver.find_element_by_id('addbutton').click()


@then('I should verify the added item')
def verify(context):
    time.sleep(2)
    added_item = context.driver.find_element_by_xpath("//span[@class='done-false']").text

    time.sleep(2)

    if added_item in "Yey, Let's add it to list":
        return True
    else:
        return False
