
//Homework config 

exports.config = {
    framework: 'jasmine', //Type of Framework used 
    directConnect:true, 
   //specs: ['login.js','orders.js','items.js','products.js'], //Name of the Specfile 
   //specs: ['specnew.js'], //Name of the Specfile 
   specs: ['login.js','mylists.js','myprojects.js','inbox.js','feedback.js'],
   capabilities: {
    'browserName': 'chrome'
  },
  

  
};
     
 

