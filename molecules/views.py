from django.shortcuts import render_to_response
import os

# Create your views here.
def index(request):
	return render_to_response(os.path.join('molecules','index.html'))
	
def molecules35(request):
	return render_to_response(os.path.join('molecules','molecules35.html'))
	
def molecules30(request):
	return render_to_response(os.path.join('molecules','molecules30.html'))
	
def molecules22(request):
	return render_to_response(os.path.join('molecules','molecules22.html'))
	
def validation_O3(request):
	return render_to_response(os.path.join('molecules','validation_O3.html'))
	
def testtable(request):
	return render_to_response(os.path.join('molecules','testtable.html'))