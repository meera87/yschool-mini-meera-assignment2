<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <body>
        <h1>Student Marks Details</h1>
        <form action="Controller" method="POST">
            <table border="0">           
                    <tr>
                        <td>Student Name:
                        <td><select name="sname">
                                <option>keerthu</option>
                                <option>nirosh</option>
                                <option>jevir</option>
                                <option>sukir</option>
                                <option>sanjee</option>
                                <option>kaji</option>
                            </select></td></td>                 
                    </tr>
                    <tr>
                        <td>Grade:</td>
                        <td><select name="grade">
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
                                    <option>5</option>
                                    <option>6</option>
                                    <option>7</option>
                                    <option>8</option>
                                    <option>9</option>
                                    <option>10</option>
                                    <option>11</option>
                                    <option>12</option>
                                    <option>13</option>
                                </select></td>
                    </tr>
                    <tr>
                        <td>Subject:</td>
                        <td><input type="text" name="subject" value="" size="20" /></td>
                    </tr>
                    <tr>
                        <td>Marks:</td>
                        <td><input type="text" name="marks" value="" size="20" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Add" name="add" /></td>
                    </tr>
            </table>
         </form>
    </body>
</html>
