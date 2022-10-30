<?php
    require_once "dbconn/dbconn.php";

    if(function_exists($_GET['function'])) {
          $_GET['function']();
    }

    function get_coffee()
    {
       global $connect;      
       $query = $connect->query("SELECT * FROM coffee");            
       while($row=mysqli_fetch_object($query))
       {
          $data[] =$row;
       }
       $response=array(
                      'status' => 1,
                      'message' =>'Success',
                      'data' => $data
                   );
       header('Content-Type: application/json');
       echo json_encode($response);
    }   
?>