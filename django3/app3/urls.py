from django.urls import path
from app3.views import home,next
urlpatterns = [
	path('', home),
    path('next/',next,name='next')
    ]