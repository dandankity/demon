<%@ page language="java" pageEncoding="UTF-8"%>
<html>

<body>
        <h1 style = "color:blue;text-align:center;font-size = 19px">Query Result</h1>
        <div style="background-color:#EEEEEE;width:'100%';color:blue;font-size:16px;">
            <div style="float:left;width:20%; margin:20px 30px" >NAME</div>
            <div style="float:left;width:20%; margin:20px 30px" >BUDGET</div>
            <div style="float:left;width:20%; margin:20px 0px">COST</div>
            <div style="float:left;width:20%; margin:20px 0px">BLANCE</div>
        </div>



           <div style="background-color:#EEEEEE;width:'100%';font-size:14px;">
                 <div style="float:left;width:20%; margin:10px 30px">${name}</div>
                 <div style="float:left;width:20%; margin:10px 30px">${budget}</div>
                 <div style="float:left;width:20%; margin:10px 0px">${costSum}</div>
                 <div style="float:left;width:20%; margin:10px 0px">${balance}</div>
           </div>

    </body>
</html>