
    function validate(frm){
      //set flag value for Validation purpose
    	frm.vflag.value="yes";
    	
   	//read form data
    var name=frm.pname.value;
    var age    =frm.page.value;
    
      //emptying invalided data 
    document.getElementById("nameErr").innerHTML="";
    document.getElementById("ageErr").innerHTML="";



       
        //client side form validation logic
        if(name==""){
          document.getElementById("nameErr").innerHTML="name is mandatory";
          frm.pname.focus();
          frm.pname.value="";
          return false;
        }else
            if(age==""){
          document.getElementById("ageErr").innerHTML="Age is mandatory";
          frm.page.focus();
          frm.page.value="";
          return false;
        }else
            if(isNaN(age)){
          document.getElementById("ageErr").innerHTML="Age must be in numeric";
          frm.page.focus();
          frm.page.value="";
          return false;
        }else
       if(age<1 || age>125){
          document.getElementById("ageErr").innerHTML="Age must be in the range of 1 to 125";
          frm.page.focus();
          frm.page.value="";
          return false;
        }
        alert("javaScript in not Enable");
           return true;
    }
