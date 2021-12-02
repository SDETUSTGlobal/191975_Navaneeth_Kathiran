from selenium import webdriver
import time
print("test case started")

driver=webdriver.Chrome()

driver.maximize_window()

driver.delete_all_cookies()

driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx")

driver.find_element_by_name("ctl00$MainContent$username").send_keys("Tester")

driver.find_element_by_name("ctl00$MainContent$password").send_keys("test")

driver.find_element_by_name("ctl00$MainContent$login_button").click()
time.sleep(5)

driver.close()
print("smartbears login successfully completed")