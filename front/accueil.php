<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Accueil</title>
</head>
<body style='background:#fff;'>
<div id="content">
    <!-- tester si l'utilisateur est connecté -->
    <?php
    session_start();
    if ($_SESSION['username'] !== "") {
        $user = $_SESSION['username'];
        // afficher un message
        echo "Bonjour $user, vous êtes connecté";
    }
    ?>
</div>
<div id="content">

    <a href='accueil.php?deconnexion=true'><span>Déconnexion</span></a>

    <!-- tester si l'utilisateur est connecté -->
    <?php
    session_start();
    if (isset($_GET['deconnexion'])) {
        if ($_GET['deconnexion'] == true) {
            session_unset();
            header("location:login.php");
        }
    } else if ($_SESSION['username'] !== "") {
        $user = $_SESSION['username'];
        // afficher un message
        echo "<br>Bonjour $user, vous êtes connectés";
    }
    ?>

</div>
</body>
</html>