<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student List</title>

<style>
body{
    margin:0;
    font-family:Poppins,sans-serif;
    background:#f4f7f4;
}

.container{
    width:85%;
    margin:40px auto;
    background:white;
    border-radius:15px;
    padding:25px;
    box-shadow:0 6px 18px rgba(0,0,0,.15);
}

h2{
    text-align:center;
    color:#1a6b3a;
    margin-bottom:20px;
}

table{
    width:100%;
    border-collapse:collapse;
}

th{
    background:#1a6b3a;
    color:white;
    padding:12px;
}

td{
    padding:12px;
    text-align:center;
    border-bottom:1px solid #ddd;
}

tr:nth-child(even){
    background:#f8f8f8;
}

tr:hover{
    background:#e8f5e9;
}

button{
    background:#1a6b3a;
    color:white;
    border:none;
    padding:8px 16px;
    border-radius:6px;
    cursor:pointer;
}

button:hover{
    background:#f4a022;
}
</style>

</head>
<body>

<div class="container">

<h2>Student List</h2>

<table>
    <tr>
        <th>USN</th>
        <th>Name</th>
        <th>Department</th>
        <th>Semester</th>
        <th>Email</th>
        <th>Action</th>
    </tr>

    <tr>
        <td>1DT24CS001</td>
        <td>Aman Kumar</td>
        <td>CSE</td>
        <td>4</td>
        <td>aman@gmail.com</td>
        <td><button>View</button></td>
    </tr>

    <tr>
        <td>1DT24CS002</td>
        <td>Sneha H</td>
        <td>CSE</td>
        <td>4</td>
        <td>sneha@gmail.com</td>
        <td><button>View</button></td>
    </tr>

    <tr>
        <td>1DT24CS003</td>
        <td>Rahul</td>
        <td>CSE</td>
        <td>4</td>
        <td>rahul@gmail.com</td>
        <td><button>View</button></td>
    </tr>

    <tr>
        <td>1DT24CS004</td>
        <td>Priya</td>
        <td>CSE</td>
        <td>4</td>
        <td>priya@gmail.com</td>
        <td><button>View</button></td>
    </tr>

    <tr>
        <td>1DT24CS005</td>
        <td>Karan</td>
        <td>CSE</td>
        <td>4</td>
        <td>karan@gmail.com</td>
        <td><button>View</button></td>
    </tr>

</table>

</div>

</body>
</html>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Information</title>

<style>
body{
    margin:0;
    font-family:Arial,sans-serif;
    background:#eef3f8;
}

.header{
    background:#2c3e50;
    color:white;
    text-align:center;
    padding:20px;
}

.container{
    width:90%;
    margin:30px auto;
    background:white;
    padding:25px;
    border-radius:12px;
    box-shadow:0 5px 15px rgba(0,0,0,0.15);
}

h2{
    text-align:center;
    color:#2c3e50;
    margin-bottom:20px;
}

table{
    width:100%;
    border-collapse:collapse;
    overflow:hidden;
    border-radius:10px;
}

th{
    background:#3498db;
    color:white;
    padding:12px;
}

td{
    padding:12px;
    text-align:center;
    border-bottom:1px solid #ddd;
}

tr:nth-child(even){
    background:#f9f9f9;
}

tr:hover{
    background:#eaf6ff;
}

.status{
    color:green;
    font-weight:bold;
}

button{
    background:#3498db;
    color:white;
    border:none;
    padding:8px 15px;
    border-radius:5px;
    cursor:pointer;
}

button:hover{
    background:#2c80b4;
}
</style>
</head>

<body>

<div class="header">
    <h1>College Student Management System</h1>
</div>

<div class="container">

<h2>Student Details</h2>

<table>

<tr>
    <th>USN</th>
    <th>Name</th>
    <th>Department</th>
    <th>Semester</th>
    <th>Phone</th>
    <th>Email</th>
    <th>Status</th>
    <th>Action</th>
</tr>

<tr>
    <td>1DT24CS001</td>
    <td>Aman Kumar</td>
    <td>CSE</td>
    <td>4</td>
    <td>9876543210</td>
    <td>aman@gmail.com</td>
    <td class="status">Active</td>
    <td><button>Details</button></td>
</tr>

<tr>
    <td>1DT24CS002</td>
    <td>Sneha H</td>
    <td>CSE</td>
    <td>4</td>
    <td>9876543211</td>
    <td>sneha@gmail.com</td>
    <td class="status">Active</td>
    <td><button>Details</button></td>
</tr>

<tr>
    <td>1DT24CS003</td>
    <td>Rahul</td>
    <td>ISE</td>
    <td>4</td>
    <td>9876543212</td>
    <td>rahul@gmail.com</td>
    <td class="status">Active</td>
    <td><button>Details</button></td>
</tr>

<tr>
    <td>1DT24CS004</td>
    <td>Priya</td>
    <td>ECE</td>
    <td>4</td>
    <td>9876543213</td>
    <td>priya@gmail.com</td>
    <td class="status">Active</td>
    <td><button>Details</button></td>
</tr>

<tr>
    <td>1DT24CS005</td>
    <td>Karan</td>
    <td>AIML</td>
    <td>4</td>
    <td>9876543214</td>
    <td>karan@gmail.com</td>
    <td class="status">Active</td>
    <td><button>Details</button></td>
</tr>

</table>

</div>

</body>
</html>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Records</title>

<style>
body{
    margin:0;
    font-family:Verdana,sans-serif;
    background:#eef5ff;
}

.header{
    background:#34495e;
    color:white;
    text-align:center;
    padding:18px;
}

.container{
    width:88%;
    margin:30px auto;
    background:white;
    padding:20px;
    border-radius:10px;
    box-shadow:0 4px 10px rgba(0,0,0,0.15);
}

h2{
    text-align:center;
    color:#34495e;
}

table{
    width:100%;
    border-collapse:collapse;
}

th{
    background:#2980b9;
    color:white;
    padding:10px;
}

td{
    padding:10px;
    text-align:center;
    border:1px solid #ddd;
}

tr:nth-child(even){
    background:#f4f8fc;
}

tr:hover{
    background:#dff1ff;
}

.status{
    color:green;
    font-weight:bold;
}

button{
    background:#2980b9;
    color:white;
    border:none;
    padding:8px 14px;
    border-radius:5px;
    cursor:pointer;
}

button:hover{
    background:#1f6692;
}
</style>

</head>

<body>

<div class="header">
    <h1>University Student Records</h1>
</div>

<div class="container">

<h2>Student Information</h2>

<table>

<tr>
    <th>USN</th>
    <th>Student Name</th>
    <th>Branch</th>
    <th>Semester</th>
    <th>Phone</th>
    <th>Email</th>
    <th>Status</th>
    <th>Option</th>
</tr>

<tr>
    <td>1DT24CS011</td>
    <td>Arjun R</td>
    <td>CSE</td>
    <td>5</td>
    <td>9876501111</td>
    <td>arjun@gmail.com</td>
    <td class="status">Present</td>
    <td><button>Open</button></td>
</tr>

<tr>
    <td>1DT24CS012</td>
    <td>Divya S</td>
    <td>ISE</td>
    <td>5</td>
    <td>9876502222</td>
    <td>divya@gmail.com</td>
    <td class="status">Present</td>
    <td><button>Open</button></td>
</tr>

<tr>
    <td>1DT24CS013</td>
    <td>Kiran M</td>
    <td>ECE</td>
    <td>5</td>
    <td>9876503333</td>
    <td>kiran@gmail.com</td>
    <td class="status">Present</td>
    <td><button>Open</button></td>
</tr>

<tr>
    <td>1DT24CS014</td>
    <td>Nisha P</td>
    <td>AIML</td>
    <td>5</td>
    <td>9876504444</td>
    <td>nisha@gmail.com</td>
    <td class="status">Present</td>
    <td><button>Open</button></td>
</tr>

<tr>
    <td>1DT24CS015</td>
    <td>Rohit K</td>
    <td>CSE</td>
    <td>5</td>
    <td>9876505555</td>
    <td>rohit@gmail.com</td>
    <td class="status">Present</td>
    <td><button>Open</button></td>
</tr>

</table>

</div>

</body>
</html>