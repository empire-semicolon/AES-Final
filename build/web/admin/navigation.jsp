<%-- 
    Document   : navigation
    Created on : May 18, 2015, 9:42:53 AM
    Author     : User
--%>

<%@page import="com.aes.model.UserBean"%>
<!-- Navigation -->
<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="home.jsp">
            <img src="resources/images/aes_logo_3.png" class="img-responsive" height="250" width="250" style="margin-top:-17px">
        </a>
    </div>
    <!-- /.navbar-header -->
    <ul class="nav navbar-top-links navbar-right">
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                <i class="fa fa-user fa-fw"></i> 
                <%= ((UserBean)session.getAttribute("user")).getStrUserName() %> 
                <i class="fa fa-caret-down"></i>
            </a>
            <ul class="dropdown-menu dropdown-user">
                <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                </li>
                <li class="divider"></li>
                <li><a href="logout"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                </li>
            </ul>
            <!-- /.dropdown-user -->
        </li>
        <!-- /.dropdown -->
    </ul>
    <!-- /.navbar-top-links -->
    <div class="navbar-default sidebar" role="navigation">
        <div class="sidebar-nav navbar-collapse">
            <ul class="nav" id="side-menu">
                <li class="">
                    <a href="#"><i class="fa fa-users fa-fw"></i> Accounts<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li>
                            <a href="add_user.jsp?action=add">Add User</a>
                        </li>
                        <li>
                            <a href="manage_users.jsp">Manage Users</a>
                        </li>
                    </ul>
                    <!-- /.nav-second-level -->
                </li>
                <li class="">
                    <a href="#"><i class="fa fa-sitemap fa-fw"></i> Courses<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li>
                            <a href="add_course.jsp">Add Course</a>
                        </li>
                        <li>
                            <a href="manage_courses.jsp">Manage Courses</a>
                        </li>
                        <li>
                            <a href="assign_course.jsp">Assign Course</a>
                        </li>
                    </ul>
                    <!-- /.nav-second-level -->
                </li>
                <li>
                    <a href="#"><i class="fa fa-file fa-fw"></i> Chapters<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li>
                            <a href="add_presentation.jsp">Add Chapter</a>
                        </li>
                        <li>
                            <a href="manage_presentations.jsp">Manage Chapters</a>
                        </li>
                    </ul>
                    <!-- /.nav-second-level -->
                </li>
                <li>
                    <a href="#"><i class="fa fa-book fa-fw"></i> Exams<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li>
                            <a href="add_exam.jsp">Add Exam</a>
                        </li>
                        <li>
                            <a href="manage_exams.jsp">Manage Exams</a>
                        </li>
                    </ul>
                    <!-- /.nav-second-level -->
                </li>
            </ul>
        </div>
        <!-- /.sidebar-collapse -->
    </div>
    <!-- /.navbar-static-side -->
</nav>