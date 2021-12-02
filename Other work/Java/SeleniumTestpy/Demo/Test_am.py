
from selenium import webdriver  
import time  

print("test case started")  
driver = webdriver.Chrome()  
driver.maximize_window()  
driver.delete_all_cookies()  

driver.get("https://www.gmail.com")  
driver.find_element_by_id("identifierId").send_keys("knavaneeth21@gmail.com")  
time.sleep(2)  
