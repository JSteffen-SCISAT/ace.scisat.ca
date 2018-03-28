//update bing maps key
Cesium.BingMapsApi.defaultKey = 'fWDgSzttTLCbHpbQeLpm~W5ZFSEAonrWmUztoNDYgfw~ApalPOynk04hBOe_vHhA5ojCRE42tXmr9RpqjXUztU_Qj32Fk2mzDqpIczorn8FO';

// code to create viewer, set scene and try and optimize frame rate
var viewer = new Cesium.Viewer('cesiumContainer', {
	//sceneMode: Cesium.SceneMode.SCENE2D
	fxaa: false,
	timeline: false,
	imageryProvider: new Cesium.BingMapsImageryProvider({
		url : 'https://dev.virtualearth.net',
		mapStyle : Cesium.BingMapsStyle.AERIAL_WITH_LABELS
	}),
	baseLayerPicker : false,
	fullscreenButton : false,
	homeButton : false,		
});

//Configures various viewer settings
//viewer.scene.debugShowFramesPerSecond = true;
viewer.resolutionScale = 1.0 / devicePixelRatio;
//viewer.fullscreenButton = false;
viewer.navigationInstructionsInitiallyVisible = false;
//viewer.timeline = false;
viewer.scene.fxaa = false;

// code to import current czml file
var czmlSource = new Cesium.CzmlDataSource();
var czmlFile = "{% static "Scenario/WebsiteCZMLScenario.czml" %}";
czmlSource.load(czmlFile);
viewer.dataSources.add(czmlSource);

// code to follow scisat, after CZML load promise is finished
czmlSource.load(czmlFile).then(function(){
	//clearLoader();
	var scisat1 = czmlSource.entities.getById("Satellite/Scisat1");
	var camera = viewer.camera;
	
	
	// Updates time to be real time
	var clock = viewer.clock;
	clock.clockStep = Cesium.ClockStep.SYSTEM_CLOCK;
	var curTime = clock.currentTime;

	// Tracks satellite with a defined camera angle to start
	var s1Position = scisat1.position.getValue(curTime);
	var cameraPosition = s1Position;
	//var cameraOffset = s1Position;
	//console.log(cameraOffset)
	//cameraOffset.z = cameraOffset.z - 100;
	//scisat1.viewFrom = cameraOffset;
	scisat1.viewFrom = Cesium.Cartesian3.fromElements(-4.0,2.50,7.00) //Spherical coordinates for (45,-45)
	//scisat1.viewFrom = Cesium.Cartesian3.fromDegrees(-45,45,10);
	//console.log(scisat1.viewFrom);
	//console.log(cameraOffset);
	viewer.trackedEntity = scisat1;
	//console.log(cameraOffset);
	//console.log(s1Position);
});