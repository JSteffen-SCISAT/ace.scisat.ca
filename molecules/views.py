from django.shortcuts import render_to_response, render
from publications.models import Publication,List
import os

# Create your views here.
def index(request, molecule=None):
	mol_list = List.objects.raw('select id,list from publications_list where list like \'mol%%\'')
	return render_to_response(os.path.join('molecules','index.html'), context={'molecule':molecule, 'list':[1,2,3,4]})
	
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