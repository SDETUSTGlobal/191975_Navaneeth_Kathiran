
from selenium import webdriver  
import time  

print("test case started")  
driver = webdriver.Chrome()  
driver.maximize_window()  
driver.delete_all_cookies()  

driver.get("https://www.flipkart.com/")  
driver.find_element_by_xpath("/html/body/div[2]/div/div/button").click()  
time.sleep(2)  
