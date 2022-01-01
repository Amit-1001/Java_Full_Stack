<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <title> Exam Register</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>


     <!--inline css-->
        <style>
              .error{
                    color: red;
              }
        </style>
    <body>
             <h1>Enter Student Marks</h1>
                    <!--This is spring form tag-->
             <div class="row d-flex justify-content-center">
                    <form:form action="/store" modelAttribute="data">
                     <div class="col-md-6">
                        Roll No(*):<form:input class="form-control" path="rollNo"/>
                                   <form:errors path="rollNo" cssClass="error"/>
                                   <br><br>
                         </div>
                          <div class="col-md-6">
                           First Name:<form:input class="form-control" path="firstName"/>
                           <form:errors path="firstName" cssClass="error"/>
                            <br><br>
                      </div>

                         <div class="col-md-6">
                              Last Name(*):<form:input class="form-control" path="lastName"/>
                              <form:errors path="lastName" cssClass="error"/>
                             <br><br>
                          </div>

                          <div class="col-md-6">
                            Semester(*):<form:input class="form-control" path="semester"/>
                            <form:errors path="semester" cssClass="error"/>
                            <br><br>
                           </div>


                         <div class="col-md-6">
                                English marks:<form:input class="form-control" path="english"/>
                                <form:errors path="english" cssClass="error"/>
                                 <br><br>
                           </div>


                       <div class="col-md-6">
                        Math marks:<form:input class="form-control" path="math"/>
                        <form:errors path="math" cssClass="error"/>
                      <br><br>

                       </div>



                       <div class="col-md-6">
                        Chemistry marks:<form:input class="form-control" path="chemistry"/>
                        <form:errors path="chemistry" cssClass="error"/>
                        <br><br>


                        </div>

                        <div class="col-md-6">
                           Biology marks:<form:input class="form-control" path="biology"/>
                           <form:errors path="biology" cssClass="error"/>
                            <br><br>

                           </div>


                  <div class="col-md-6">
                        Physics marks:<form:input class="form-control" path="physics"/>
                        <form:errors path="physics" cssClass="error"/>
                        <br><br>
                  </div>





                     <input class="btn btn-primary" type="submit" value="Submit">

                    </form:form>
             </div>
    </body>

</html>