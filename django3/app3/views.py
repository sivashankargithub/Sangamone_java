from django.shortcuts import render
import json
from app3.forms import inputform

def home(request):
    result=''
    list3=[]
    s1="What is the capital of "
    s2="?"
    if request.method=='POST':
        form=inputform(request.POST)
        if form.is_valid():
            data=form.cleaned_data
            in1=data.get('input')
            list3.append(in1)
            question=s1+'USA'+s2
            result="Sivashankar"
            return render(request,'app3/questions.html',{'param1':result, 'form':form})
    else:
        result='Your Quiz Starts Now'
    return render(request,'app3/index.html',{'param1':result })

def next(request):
    if request.method=="POST":
        form=inputform(request.POST)
        if form.is_valid():
            data=form.cleaned_data
            in1=data.get('input')
            result='What is the capital of U.S.A?'
            return render(request,'app3/questions.html',{'param1':result})
    else:
        form=inputform()
    return render(request,'app3/question.html',{'form':form})

def quiz1():
    f1=open("capitals.json","r")
    data=json.load(f1)
    list1=list(data.keys())
    list2=list(data.values())
    responses=[]
    marks=[]
    s1="What is the capital of "
    s2="?"
    s3="The capital of "
    s4=" is "
    s5="You have scored marks of"
    question=s1+list1[0]+s2
    return question
