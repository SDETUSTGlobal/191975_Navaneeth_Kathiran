
*** Settings ***
Library           SeleniumLibrary

*** Variables ***

${SERVER}         127.0.0.1:5000
${BROWSER}        chrome
${DELAY}          0.3
${VALID UID}      191975
${VALID Uname}    Navaneeth Kathiran
${VALID company}  UST
${VALID email}    Navaneeth.Kathiran@ust.com

${WELCOME URL}    http://${SERVER}/
${SUCCESS URL}    http://${SERVER}/success

*** Test Cases ***

Open Browser To Welcome Page
    Open Browser    ${WELCOME URL}    ${BROWSER}
    Maximize Browser Window
    Set Selenium Speed    ${DELAY}


Go To Welcome Page
    Go To    ${WELCOME URL}
    #Login Page Should Be Open

Input UID
  #  [Arguments]    ${uid}
    INPUT Text   uid   ${VALID UID}

Input Username
   # [Arguments]    ${username}
    Input Text    username   ${VALID Uname}

Input Company
  #  [Arguments]    ${company}
    INPUT TEXT   company   ${VALID company}

Input Email
   # [Arguments]    ${email}
    Input Text    email   ${VALID email}

Submit Credentials
    Click Button   submit_button

Success Page Should Be Open
    Location Should Be    ${SUCCESS URL}
    Title Should Be   Success!

Close Browser
    close browser



