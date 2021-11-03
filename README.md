# Taskmaster

## Overview

This repository includes an Android app that will be the main focus of the second half of the 401 course. over time this will grow to be a fully-featured application.

## Architecture

The programing language used to build this project is java and using the Android Studio to complete it.


## Lab: 26 - Beginning TaskMaster

This lab is an introduction to Android and how to use the Android Studio. In this lab I create three activities, The Main Activity, Add Task Activity and All Task Activity.

### Main Activity

It is the home page which contains an image and two buttons each one starts a new activity when click on it.

![Home page](./app/src/screenshots/img1.PNG)

### Add Task Activity

When the user click on `ADD TASK` button from home page it will take The user to this page(*Add Task Page*). In this page the user can add a task title and a description and after that can click on th `ADD TASK` button.

![Add task page](./app/src/screenshots/img2.PNG)

When the user click on the `ADD TASK` button it will show a message that the task is submitted.

![Submitted task](./app/src/screenshots/img4.PNG)

### All Task Activity

When the user click on `ALL TASK` button from home page it will take The user to this page(*All Task Page*). This page contains an image.

![All task page](./app/src/screenshots/img3.PNG)

## Lab: 27 - Data in TaskMaster

In This lab added three buttons on the main page, each button for one task that takes the user to the task detail page when the user clicks on it. Also, added a setting button on the home page that takes the user to the setting page.

### Setting Activity

This page contains a fild which the user can put his/her name and click on save buttons to save the name.

![setting page](./app/src/screenshots/lab27SS5.PNG)

### Main Activity

The home page contains new four buttons. The first three buttons for tasks, Each button takes the user to a different task detail page. and the fourth button for the setting page that I showed you above. Also, the name that the user wrote on the setting page appears at the top of the main page.

![main page](./app/src/screenshots/lab27SS1.PNG)

### Task Detail Activity

Task detail page appears when the user click on each task on the home page.

![Task1 detail page](./app/src/screenshots/lab27SS2.PNG)

![Task2 detail page](./app/src/screenshots/lab27SS3.PNG)

![Task3 detail page](./app/src/screenshots/lab27SS4.PNG)

## Lab: 28 - RecyclerView

In this lab I used the `RecyclerView` to view all tasks in the home page as the list. 

### Main Activity

I refactored the homepage to show all the tasks as the list and the user can scroll down or up to view the tasks.

![RecyclerView list](./app/src/screenshots/lab28SS1.PNG)

And also when the user clicks on any task, it will move him/her to the task details page.

![details page](./app/src/screenshots/lab28SS2.PNG)