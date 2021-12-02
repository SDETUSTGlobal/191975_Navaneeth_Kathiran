
describe('Freelancer projects', ()=> {
    browser.driver.get('https://www.freelancer.in/dashboard');
    it('Should navigate to my projects Page',()=>  {
        element(By.xpath("")).click();
        console.log("my projects");
            browser.getCurrentUrl().then((url) => {
                expect(url).toBe('https://www.freelancer.in/manage/work/projects/open');
            });
            
        });
        
    });
