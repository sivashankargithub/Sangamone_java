from django.shortcuts import render
from app4.forms import inputform
import json

def home(request):
    result='Quiz Starts Now. Enter any word'
    list1,list2=zip(*quiz())
    list11=list(list1)
    question1='What is the capital of '+list11[i]+'?'
    list22=list(list2)
    if request.method=="POST":
        question1='What is the capital of '+list11[0]+'?'
        form=inputform(request.POST)
        if form.is_valid():
            data=form.cleaned_data
            in1=data.get('input')
            return render(request,'app4/index.html',{'param2':question1,'form':form})
    else:
        form=inputform()
    return render(request,'app4/index.html',{'param2':result,'form':form})


def quiz():
    f1=open("capitals.json","r")
    data=json.load(f1)
    list1=list(data.keys())
    list2=list(data.values())
    list3=zip(list1,list2)
    return list3

def ans(a):
    list1,list2=zip(*quiz())
    list11=list(list1)
    list22=list(list2)
    marks=[]
    for i in range(0,3,1):
        if list22[i]==a:
            marks.append(5)
        else:
            marks.append(0)
    return marks
