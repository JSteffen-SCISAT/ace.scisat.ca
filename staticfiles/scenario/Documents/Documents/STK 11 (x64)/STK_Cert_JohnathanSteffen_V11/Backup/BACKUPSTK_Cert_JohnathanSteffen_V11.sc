stk.v.11.0
WrittenBy    STK_v11.2.0
BEGIN Scenario
    Name            BACKUPSTK_Cert_JohnathanSteffen_V11

BEGIN Epoch

    Epoch        28 Oct 2011 18:54:00.000000000
    SmartEpoch
	BEGIN	EVENT
			Epoch	28 Oct 2011 18:54:00.000000000
			EventEpoch
				BEGIN	EVENT
					Type	EVENT_LINKTO
					Name	AnalysisStartTime
				END	EVENT
			EpochState	Implicit
	END	EVENT


END Epoch

BEGIN Interval

Start                   28 Oct 2011 18:54:00.000000000
Stop                    28 Oct 2011 23:54:00.000000000
    SmartInterval
	BEGIN	EVENTINTERVAL
			StartEvent
				BEGIN	EVENT
						Epoch	28 Oct 2011 18:54:00.000000000
						EpochState	Explicit
				END	EVENT
			Duration		+5 hours
			IntervalState	StartDuration
	END	EVENTINTERVAL

EpochUsesAnalStart      No
AnimStartUsesAnalStart  No
AnimStopUsesAnalStop    No

END Interval

BEGIN EOPFile

    EOPFilename     EOP-v1.1.txt

END EOPFile

BEGIN GlobalPrefs

    SatelliteNoOrbWarning    No
    MissilePerigeeWarning    No
    MissileStopTimeWarning   No
    AircraftWGS84Warning     Always
END GlobalPrefs

BEGIN CentralBody

    PrimaryBody     Earth

END CentralBody

BEGIN CentralBodyTerrain

    BEGIN CentralBody
        Name            Earth
        UseTerrainCache Yes
        TotalCacheSize  402653184

        BEGIN StreamingTerrain
            UseCurrentStreamingTerrainServer     No
            StreamingTerrainServerName           assets.agi.com/stk-terrain/
            StreamingTerrainAzimuthElevationMaskEnabled       No
            StreamingTerrainObscurationEnabled       No
            StreamingTerrainCoverageGridObscurationEnabled       No
        END StreamingTerrain
    END CentralBody

END CentralBodyTerrain

BEGIN StarCollection

    Name     Hipparcos 2 Mag 6

END StarCollection

BEGIN ScenarioLicenses
    Module    STKProfessionalv11.2
    Module    STKv11.2
END ScenarioLicenses

BEGIN QuickReports

    BEGIN Report
        Name    Ica_LatLon
        Type    Report
        BaseDir Install
        Style    LLA Position
        AGIViewer    Yes
        Instance    Place/Ica
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      1
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "28 Oct 2011 18:54:00.000000000" "28 Oct 2011 23:54:00.000000000"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     No
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    303
        WindowRectTop     230
        WindowRectRight   1813
        WindowRectBottom  638
    END Report

    BEGIN Report
        Name    Camera_to_Runway
        Type    Report
        BaseDir Install
        Style    Access
        AGIViewer    Yes
        Instance    Aircraft/CertAircraft/Sensor/AC_Camera
        BEGIN InstanceList
            Instance    AreaTarget/Runway
        END InstanceList
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      4
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     No
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    326
        WindowRectTop     227
        WindowRectRight   1815
        WindowRectBottom  640
    END Report

    BEGIN Report
        Name    SatCamera_to_Ica
        Type    Report
        BaseDir Install
        Style    AER
        AGIViewer    Yes
        Instance    Satellite/CertSatellite/Sensor/Sat_Camera
        BEGIN InstanceList
            Instance    Place/Ica
        END InstanceList
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      2
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                Step        60.000000
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     No
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    326
        WindowRectTop     227
        WindowRectRight   1815
        WindowRectBottom  640
    END Report

    BEGIN Report
        Name    Aircraft_to_Runway
        Type    Report
        BaseDir Install
        Style    LOS
        AGIViewer    Yes
        Instance    Aircraft/CertAircraft
        BEGIN InstanceList
            Instance    AreaTarget/Runway
        END InstanceList
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      4
                ShowIntervals    No
BEGIN IntervalList

DateUnitAbrv UTCG

BEGIN Intervals

    "28 Oct 2011 18:54:00.000000000" "28 Oct 2011 19:41:27.252695806"
END Intervals

END IntervalList

                TimeType    Interval
                TimeInterval 	IntervalTimePeriod
                SamplingType    Default
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     No
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    228
        WindowRectTop     155
        WindowRectRight   1738
        WindowRectBottom  563
    END Report

    BEGIN Report
        Name    USSats_to_Ica
        Type    Graph
        BaseDir Install
        Style    Access
        AGIViewer    No
        Instance    Place/Ica
        BEGIN InstanceList
            Instance    Satellite/Aqua_27424
            Instance    Satellite/Aura_28376
            Instance    Satellite/Cloudsat_29107
            Instance    Satellite/Coriolis_27640
            Instance    Satellite/Geoeye1_33331
            Instance    Satellite/Landsat8_39084
            Instance    Satellite/Terra_25994
            Instance    Satellite/Worldview1_32060
            Instance    Satellite/Worldview2_35946
        END InstanceList
        BEGIN TimeData
            BEGIN Section
                SectionNumber    1
                SectionType      4
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    2
                SectionType      4
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    3
                SectionType      4
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    4
                SectionType      4
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    5
                SectionType      4
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    6
                SectionType      4
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    7
                SectionType      4
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    8
                SectionType      4
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
            BEGIN Section
                SectionNumber    9
                SectionType      4
                ShowIntervals    No
                TimeType    Availability
                SamplingType    Default
                TimeBound    0
            END Section
        END TimeData
        DisplayOnLoad     Yes
        FrameType         0
        DockCircleID      0
        DockID            0
        WindowRectLeft    218
        WindowRectTop     123
        WindowRectRight   1923
        WindowRectBottom  748
    END Report
END QuickReports

BEGIN WebData
        EnableWebTerrainData    No
        SaveWebTerrainDataPasswords    No
        BEGIN ConfigServerDataList
            BEGIN ConfigServerData
                Name "globeserver.agi.com"
                Port 80
                DataURL "bin/getGlobeSvrConfig.pl"
            END ConfigServerData
        END ConfigServerDataList
END WebData

BEGIN Extensions
    
    BEGIN ClsApp
		RangeConstraint         5000.000
		ApoPeriPad              30000.000
		OrbitPathPad            100000.000
		TimeDistPad             30000.000
		OutOfDate               2592000.000
		MaxApoPeriStep          900.000
		ApoPeriAngle            0.785
		UseApogeePerigeeFilter  Yes
		UsePathFilter           No
		UseTimeFilter           No
		UseOutOfDate            Yes
		CreateSats              No
		MaxSatsToCreate         500
		UseModelScale           No
		ModelScale              0.000
		UseCrossRefDb           Yes
		CollisionDB                     stkAllTLE.tce
		CollisionCrossRefDB             stkAllTLE.sd
		ShowLine                Yes
		AnimHighlight           Yes
		StaticHighlight         Yes
		UseLaunchWindow                         No
		LaunchWindowUseEntireTraj               Yes
		LaunchWindowTrajMETStart                0.000
		LaunchWindowTrajMETStop                 900.000
		LaunchWindowStart                       191023563.000
		LaunchWindowStop                        191091963.000
		LaunchMETOffset                         0.000
		LaunchWindowUseSecEphem                 No 
		LaunchWindowUseScenFolderForSecEphem    Yes
		LaunchWindowUsePrimEphem                No 
		LaunchWindowUseScenFolderForPrimEphem   Yes
    LaunchWindowIntervalPtr
	BEGIN	EVENTINTERVAL
			BEGIN Interval
				Start	16 Nov 2017 17:00:00.000000000
				Stop	17 Nov 2017 17:00:00.000000000
			END Interval
			IntervalState	Explicit
	END	EVENTINTERVAL

		LaunchWindowUsePrimMTO                  No 
		GroupLaunches                           No 
		LWTimeConvergence                       1.000e-03
		LWRelValueConvergence                   1.000e-08
		LWTSRTimeConvergence                    1.000e-04
		LWTSRRelValueConvergence                1.000e-10
		LaunchWindowStep                        300.000
		MaxTSRStep                              180.000
		MaxTSRRelMotion                         20.000
		UseLaunchArea                           No 
		LaunchAreaOrientation                   North
		LaunchAreaAzimuth                       0.000
		LaunchAreaXLimits                       -10000.000   10000.000
		LaunchAreaYLimits                       -10000.000   10000.000
		LaunchAreaNumXIntrPnts                  1
		LaunchAreaNumYIntrPnts                  1
		LaunchAreaAltReference                  Ellipsoid
		TargetSameStop                          No 
		SkipSurfaceMetric                       No 
		LWAreaTSRRelValueConvergence            1.000e-10
		AreaLaunchWindowStep                    300.000
		AreaMaxTSRStep                          30.000
		AreaMaxTSRRelMotion                     1.000
		ShowLaunchArea                          No 
		ShowBlackoutTracks                      No 
		ShowClearedTracks                       No 
		UseObjectForClearedColor                No 
		BlackoutColor                           #ff0000
		ClearedColor                             #ffffff
		ShowTracksSegments                      Yes
		ShowMinRangeTracks                      Yes
		MinRangeTrackTimeStep                   0.500000
		UsePrimStepForTracks                    Yes
		GfxTracksTimeStep                       30.000
		GfxAreaNumXIntrPnts                     1
		GfxAreaNumYIntrPnts                     1
		CreateLaunchMTO                         No 
		CovarianceSigmaScale                    3.000
		CovarianceMode                          None 
    END ClsApp
    
    BEGIN Units
		DistanceUnit		Kilometers
		TimeUnit		Seconds
		DateFormat		GregorianUTC
		AngleUnit		Degrees
		MassUnit		Kilograms
		PowerUnit		dBW
		FrequencyUnit		Gigahertz
		SmallDistanceUnit		Meters
		LatitudeUnit		Degrees
		LongitudeUnit		Degrees
		DurationUnit		Hr:Min:Sec
		Temperature		Kelvin
		SmallTimeUnit		Seconds
		RatioUnit		Decibel
		RcsUnit		Decibel
		DopplerVelocityUnit		MetersperSecond
		SARTimeResProdUnit		Meter-Second
		ForceUnit		Newtons
		PressureUnit		Pascals
		SpecificImpulseUnit		Seconds
		PRFUnit		Kilohertz
		BandwidthUnit		Megahertz
		SmallVelocityUnit		CentimetersperSecond
		Percent		Percentage
		SolidAngle		Steradians
		SpectralBandwidthUnit		Hertz
		BitsUnit		MegaBits
		MagneticFieldUnit		nanoTesla
    END Units
    
    BEGIN ReportUnits
		DistanceUnit		Kilometers
		TimeUnit		Seconds
		DateFormat		GregorianUTC
		AngleUnit		Degrees
		MassUnit		Kilograms
		PowerUnit		dBW
		FrequencyUnit		Gigahertz
		SmallDistanceUnit		Meters
		LatitudeUnit		Degrees
		LongitudeUnit		Degrees
		DurationUnit		Hr:Min:Sec
		Temperature		Kelvin
		SmallTimeUnit		Seconds
		RatioUnit		Decibel
		RcsUnit		Decibel
		DopplerVelocityUnit		MetersperSecond
		SARTimeResProdUnit		Meter-Second
		ForceUnit		Newtons
		PressureUnit		Pascals
		SpecificImpulseUnit		Seconds
		PRFUnit		Kilohertz
		BandwidthUnit		Megahertz
		SmallVelocityUnit		CentimetersperSecond
		Percent		Percentage
		SolidAngle		Steradians
		SpectralBandwidthUnit		Hertz
		BitsUnit		MegaBits
		MagneticFieldUnit		nanoTesla
    END ReportUnits
    
    BEGIN ConnectReportUnits
		DistanceUnit		Kilometers
		TimeUnit		Seconds
		DateFormat		GregorianUTC
		AngleUnit		Degrees
		MassUnit		Kilograms
		PowerUnit		dBW
		FrequencyUnit		Gigahertz
		SmallDistanceUnit		Meters
		LatitudeUnit		Degrees
		LongitudeUnit		Degrees
		DurationUnit		Hr:Min:Sec
		Temperature		Kelvin
		SmallTimeUnit		Seconds
		RatioUnit		Decibel
		RcsUnit		Decibel
		DopplerVelocityUnit		MetersperSecond
		SARTimeResProdUnit		Meter-Second
		ForceUnit		Newtons
		PressureUnit		Pascals
		SpecificImpulseUnit		Seconds
		PRFUnit		Kilohertz
		BandwidthUnit		Megahertz
		SmallVelocityUnit		CentimetersperSecond
		Percent		Percentage
		SolidAngle		Steradians
		SpectralBandwidthUnit		Hertz
		BitsUnit		MegaBits
		MagneticFieldUnit		nanoTesla
    END ConnectReportUnits
    
    BEGIN ReportFavorites
        BEGIN Class
            Name  Access
            BEGIN Favorite
                Type    Report
                BaseDir Install
                Style   LOS
            END Favorite
        END Class
        BEGIN Class
            Name  Place
            BEGIN Favorite
                Type    Report
                BaseDir Install
                Style   LLA Position
            END Favorite
        END Class
    END ReportFavorites
    
    BEGIN ADFFileData
    END ADFFileData
    
    BEGIN GenDb

		BEGIN Database
		    DbType       Satellite
		    DefDb        stkAllTLE.sd
		    UseMyDb      Off
		    MaxMatches   2000
		    Use4SOC      Off

		BEGIN FieldDefaults

			BEGIN Field
				Name "SSC Number"
				Default "*"
			END Field

			BEGIN Field
				Name "Common Name"
				Default "*"
			END Field

		END FieldDefaults

		END Database

		BEGIN Database
		    DbType       City
		    DefDb        stkCityDb.cd
		    UseMyDb      Off
		    MaxMatches   2000
		    Use4SOC      On

		BEGIN FieldDefaults

			BEGIN Field
				Name "City Name"
				Default "*"
			END Field

		END FieldDefaults

		END Database

		BEGIN Database
		    DbType       Facility
		    DefDb        stkFacility.fd
		    UseMyDb      Off
		    MaxMatches   2000
		    Use4SOC      On

		BEGIN FieldDefaults

		END FieldDefaults

		END Database
    END GenDb
    
    BEGIN SOCDb
        BEGIN Defaults
            BEGIN Catalog Cities
                BEGIN Criteria Name
                    Type  Value
                    Value Ica
                END Criteria
                BEGIN Criteria Country
                    Type  Value
                    Value PERU
                END Criteria
            END Catalog
            BEGIN Catalog Spacecraft
                BEGIN Criteria Owner
                    Type  Value
                    Value United States
                END Criteria
                BEGIN Criteria Mission
                    Type  Value
                    Value Earth Observation
                END Criteria
                BEGIN Criteria Operational Status
                    Type  Value
                    Value Operational
                END Criteria
            END Catalog
        END Defaults
    END SOCDb
    
    BEGIN Msgp4Ext
    END Msgp4Ext
    
    BEGIN FileLocations
    END FileLocations
    
    BEGIN Author
	Optimize	No
	UseBasicGlobe	No
	SaveEphemeris	Yes
	SaveScenFolder	No
	BEGIN ExternalFileTypes
	    BEGIN Type
		FileType  Calculation Scalar
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Celestial Image
		Include    No
	    END Type
	    BEGIN Type
		FileType  Cloud
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  EOP
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  External Vector Data
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Globe
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Globe Data
		Include    No
	    END Type
	    BEGIN Type
		FileType  Map
		Include    No
	    END Type
	    BEGIN Type
		FileType  Map Image
		Include    No
	    END Type
	    BEGIN Type
		FileType  Marker/Label
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Model
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Object Break-up File
		Include    No
	    END Type
	    BEGIN Type
		FileType  Planetary Ephemeris
		Include    No
	    END Type
	    BEGIN Type
		FileType  Report Style Script
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Report/Graph Style
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Scalar Calculation File
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Terrain
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Volume Grid Intervals File
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  Volumetric File
		Include    Yes
	    END Type
	    BEGIN Type
		FileType  WTM
		Include    Yes
	    END Type
	END ExternalFileTypes
	ReadOnly	No
	ViewerPassword	No
	STKPassword	No
	ExcludeInstallFiles	No
	BEGIN ExternalFileList
	END ExternalFileList
    END Author
    
    BEGIN ExportDataFile
    FileType         Ephemeris
    IntervalType     Ephemeris
    TimePeriodStart  0.000000e+00
    TimePeriodStop   0.000000e+00
    StepType         Ephemeris
    StepSize         60.000000
    EphemType        STK
    UseVehicleCentralBody   Yes
    CentralBody      Earth
    SatelliteID      -200000
    CoordSys         ICRF
    NonSatCoordSys   Fixed
    InterpolateBoundaries  Yes
    EphemFormat      Current
    InterpType       9
    InterpOrder      5
    AttCoordSys      Fixed
    Quaternions      0
    ExportCovar      Position
    AttitudeFormat   Current
    TimePrecision      6
    CCSDSDateFormat    YMD
    CCSDSEphFormat     SciNotation
    CCSDSTimeSystem    UTC
    CCSDSRefFrame      ICRF
    UseSatCenterAndFrame   No
    IncludeCovariance      No
    IncludeAcceleration    No
    CCSDSFileFormat      KVN
    END ExportDataFile
    
    BEGIN Desc
    Begin LongText
New / */Satellite CertSatellite
SetState */Satellite/CertSatellite Classical TwoBody "28 Oct 2011 18:54:00.000" "28 Oct 2011 23:54:00.000" 60 J2000 "28 Oct 2011 18:54:00.000" 6678140 0 15.0 0 0 0
    End LongText
    END Desc
    
    BEGIN RfEnv
<?xml version = "1.0" standalone = "yes"?>
<VAR name = "STK_RF_Environment">
    <SCOPE Class = "RFEnvironment">
        <VAR name = "Version">
            <STRING>&quot;1.0.0 a&quot;</STRING>
        </VAR>
        <VAR name = "ComponentName">
            <STRING>&quot;STK_RF_Environment&quot;</STRING>
        </VAR>
        <VAR name = "Description">
            <STRING>&quot;STK RF Environment&quot;</STRING>
        </VAR>
        <VAR name = "Type">
            <STRING>&quot;STK RF Environment&quot;</STRING>
        </VAR>
        <VAR name = "UserComment">
            <STRING>&quot;STK RF Environment&quot;</STRING>
        </VAR>
        <VAR name = "ReadOnly">
            <BOOL>false</BOOL>
        </VAR>
        <VAR name = "Clonable">
            <BOOL>true</BOOL>
        </VAR>
        <VAR name = "Category">
            <STRING>&quot;&quot;</STRING>
        </VAR>
        <VAR name = "PropagationChannel">
            <VAR name = "RF_Propagation_Channel">
                <SCOPE Class = "PropagationChannel">
                    <VAR name = "Version">
                        <STRING>&quot;1.0.0 a&quot;</STRING>
                    </VAR>
                    <VAR name = "ComponentName">
                        <STRING>&quot;RF_Propagation_Channel&quot;</STRING>
                    </VAR>
                    <VAR name = "Description">
                        <STRING>&quot;RF Propagation Channel&quot;</STRING>
                    </VAR>
                    <VAR name = "Type">
                        <STRING>&quot;RF Propagation Channel&quot;</STRING>
                    </VAR>
                    <VAR name = "UserComment">
                        <STRING>&quot;RF Propagation Channel&quot;</STRING>
                    </VAR>
                    <VAR name = "ReadOnly">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "Clonable">
                        <BOOL>true</BOOL>
                    </VAR>
                    <VAR name = "Category">
                        <STRING>&quot;&quot;</STRING>
                    </VAR>
                    <VAR name = "UseITU618Section2p5">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "UseCloudFogModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "CloudFogModel">
                        <VAR name = "ITU-R_P840-6">
                            <SCOPE Class = "CloudFogLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;ITU-R_P840-6&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;ITU-R P840-6&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;ITU-R P840-6&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;ITU-R P840-6&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;&quot;</STRING>
                                </VAR>
                                <VAR name = "LiquidWaterDensityValueChoice">
                                    <STRING>&quot;Liquid Water Content Density Value&quot;</STRING>
                                </VAR>
                                <VAR name = "CloudCeiling">
                                    <QUANTITY Dimension = "DistanceUnit" Unit = "m">
                                        <REAL>3000</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "CloudLayerThickness">
                                    <QUANTITY Dimension = "DistanceUnit" Unit = "m">
                                        <REAL>500</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "CloudTemp">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>273.15</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "CloudLiqWaterDensity">
                                    <QUANTITY Dimension = "SmallDensity" Unit = "kg*m^-3">
                                        <REAL>0.0075</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "AnnualAveragePercentValue">
                                    <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                        <REAL>0.01</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "MonthlyAveragePercentValue">
                                    <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                        <REAL>0.01</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "LiqWaterAverageDataMonth">
                                    <INT>1</INT>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseTropoScintModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "TropoScintModel">
                        <VAR name = "ITU-R_P618-12">
                            <SCOPE Class = "TropoScintLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;ITU-R_P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;ITU-R P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;ITU-R P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;ITU-R P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;&quot;</STRING>
                                </VAR>
                                <VAR name = "FadeDepthAverageTimeChoice">
                                    <STRING>&quot;Fade depth for the average year&quot;</STRING>
                                </VAR>
                                <VAR name = "ComputeDeepFade">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "FadeOutage">
                                    <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                        <REAL>0.001</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "PercentTimeRefracGrad">
                                    <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                        <REAL>0.1</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "SurfaceTemperature">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>273.15</REAL>
                                    </QUANTITY>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseRainModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "RainModel">
                        <VAR name = "ITU-R_P618-12">
                            <SCOPE Class = "RainLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;ITU-R_P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;ITU-R P618-12 rain model&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;ITU-R P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;ITU-R P618-12 rain model&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;&quot;</STRING>
                                </VAR>
                                <VAR name = "SurfaceTemperature">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>273.15</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "EnableDepolarizationLoss">
                                    <BOOL>false</BOOL>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseAtmosAbsorptionModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "AtmosAbsorptionModel">
                        <VAR name = "Simple_Satcom">
                            <SCOPE Class = "AtmosphericAbsorptionModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.1 a&quot;</STRING>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;Simple_Satcom&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;Simple Satcom gaseous absorption model&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;Simple Satcom&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;Simple Satcom gaseous absorption model&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;&quot;</STRING>
                                </VAR>
                                <VAR name = "SurfaceTemperature">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>293.15</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "WaterVaporConcentration">
                                    <QUANTITY Dimension = "Density" Unit = "g*m^-3">
                                        <REAL>7.5</REAL>
                                    </QUANTITY>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseUrbanTerresPropLossModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "UrbanTerresPropLossModel">
                        <VAR name = "Two_Ray">
                            <SCOPE Class = "UrbanTerrestrialPropagationLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;Two_Ray&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;Two Ray (Fourth Power Law) atmospheric absorption model&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;Two Ray&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;Two Ray (Fourth Power Law) atmospheric absorption model&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;&quot;</STRING>
                                </VAR>
                                <VAR name = "SurfaceTemperature">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>273.15</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "LossFactor">
                                    <REAL>1</REAL>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseCustomA">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "UseCustomB">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "UseCustomC">
                        <BOOL>false</BOOL>
                    </VAR>
                </SCOPE>
            </VAR>
        </VAR>
        <VAR name = "EarthTemperature">
            <QUANTITY Dimension = "Temperature" Unit = "K">
                <REAL>290</REAL>
            </QUANTITY>
        </VAR>
        <VAR name = "RainOutagePercent">
            <PROP name = "FormatString">
                <STRING>&quot;%#6.3f&quot;</STRING>
            </PROP>
            <REAL>0.1</REAL>
        </VAR>
        <VAR name = "ActiveCommSystem">
            <LINKTOOBJ>
                <STRING>&quot;None&quot;</STRING>
            </LINKTOOBJ>
        </VAR>
    </SCOPE>
</VAR>    END RfEnv
    
    BEGIN CommRad
    END CommRad
    
    BEGIN Crdn
    END Crdn
    
    BEGIN SpiceExt
    END SpiceExt
    
    BEGIN Graphics

BEGIN Animation

    StartTime          28 Oct 2011 18:54:00.000000000
    EndTimeStr         +5 hours
    CurrentTime        28 Oct 2011 18:54:00.000000000
    Mode               Stop
    Direction          Forward
    UpdateDelta        60.000000
    RefreshDelta       HighSpeed
    XRealTimeMult      30.000000
    RealTimeOffset     0.000000
    XRtStartFromPause  Yes

END Animation


        BEGIN DisplayFlags
            ShowLabels           On
            ShowPassLabel        Off
            ShowElsetNum         Off
            ShowGndTracks        On
            ShowGndMarkers       On
            ShowOrbitMarkers     On
            ShowPlanetOrbits     Off
            ShowPlanetCBIPos     On
            ShowPlanetCBILabel   On
            ShowPlanetGndPos     On
            ShowPlanetGndLabel   On
            ShowSensors          On
            ShowWayptMarkers     Off
            ShowWayptTurnMarkers Off
            ShowOrbits           On
            ShowDtedRegions      Off
            ShowAreaTgtCentroids On
            ShowToolBar          On
            ShowStatusBar        On
            ShowScrollBars       On
            AllowAnimUpdate      On
            AccShowLine          On
            AccAnimHigh          On
            AccStatHigh          On
            ShowPrintButton      On
            ShowAnimButtons      On
            ShowAnimModeButtons  On
            ShowZoomMsrButtons   On
            ShowMapCbButton      Off
        END DisplayFlags

BEGIN WinFonts

    System
    MS Sans Serif,22,0,0
    MS Sans Serif,28,0,0

END WinFonts

BEGIN MapData

    Begin TerrainConverterData
           NorthLat        0.00000000000000e+00
           EastLon         0.00000000000000e+00
           SouthLat        0.00000000000000e+00
           WestLon         0.00000000000000e+00
           ColorByRGB      No
           AltsFromMSL     No
           UseColorRamp    Yes
           UseRegionMinMax Yes
           SizeSameAsSrc   Yes
           MinAltHSV       0.00000000000000e+00 7.00000000000000e-01 8.00000000000000e-01 4.00000000000000e-01
           MaxAltHSV       1.00000000000000e+06 0.00000000000000e+00 2.00000000000000e-01 1.00000000000000e+00
           SmoothColors    Yes
           CreateChunkTrn  No
           OutputFormat    PDTTX
    End TerrainConverterData

    DisableDefKbdActions     Off
    TextShadowStyle          Dark
    TextShadowColor          #000000
    BingLevelOfDetailScale   2.000000
    BEGIN Map
        MapNum         1
        TrackingMode   LatLon
        PickEnabled    On
        PanEnabled     On

        BEGIN MapAttributes
            PrimaryBody          Earth
            SecondaryBody        Sun
            CenterLatitude       -12.966406
            CenterLongitude      -75.379273
            ProjectionAltitude   63621860.000000
            FieldOfView          35.000000
            OrthoDisplayDistance 20000000.000000
            TransformTrajectory  On
            EquatorialRadius     6378137.000000
            BackgroundColor      #000000
            LatLonLines          On
            LatSpacing           30.000000
            LonSpacing           30.000000
            LatLonLineColor      #999999
            LatLonLineStyle      2
            ShowOrthoDistGrid    Off
            OrthoGridXSpacing    5
            OrthoGridYSpacing    5
            OrthoGridColor       #ffffff
            ShowImageExtents     Off
            ImageExtentLineColor #ffffff
            ImageExtentLineStyle 0
            ImageExtentLineWidth 1.000000
            ShowImageNames       Off
            ImageNameFont        0
            Projection           EquidistantCylindrical
            Resolution           VeryLow
            CoordinateSys        ECF
            UseBackgroundImage   On
            UseBingForBackground On
            BingType             Aerial
            BingLogoHorizAlign   Right
            BingLogoVertAlign    Bottom
            BackgroundImageFile  Basic.bmp
            UseNightLights       Off
            NightLightsFactor    3.500000
            UseCloudsFile        Off
            BEGIN ZoomLocations
                BEGIN ZoomLocation
                    CenterLat    -12.966406
                    CenterLon    -75.379273
                    ZoomWidth    360.000000
                    ZoomHeight   119.002967
                End ZoomLocation
            END ZoomLocations
            UseVarAspectRatio    No
            SwapMapResolution    Yes
            NoneToVLowSwapDist   2000000.000000
            VLowToLowSwapDist    20000.000000
            LowToMediumSwapDist  10000.000000
            MediumToHighSwapDist 5000.000000
            HighToVHighSwapDist  1000.000000
            VHighToSHighSwapDist 100.000000
            BEGIN Axes
                DisplayAxes no
                CoordSys    CBI
                2aryCB      Sun
                Display+x   yes
                Label+x     yes
                Color+x     #ffffff
                Scale+x     3.000000
                Display-x   yes
                Label-x     yes
                Color-x     #ffffff
                Scale-x     3.000000
                Display+y   yes
                Label+y     yes
                Color+y     #ffffff
                Scale+y     3.000000
                Display-y   yes
                Label-y     yes
                Color-y     #ffffff
                Scale-y     3.000000
                Display+z   yes
                Label+z     yes
                Color+z     #ffffff
                Scale+z     3.000000
                Display-z   yes
                Label-z     yes
                Color-z     #ffffff
                Scale-z     3.000000
            END Axes

        END MapAttributes

        BEGIN MapList
            BEGIN Detail
                Alias RWDB2_Coastlines
                Show Yes
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_International_Borders
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Islands
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Lakes
                Show No
                Color #87cefa
            END Detail
            BEGIN Detail
                Alias RWDB2_Provincial_Borders
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Rivers
                Show No
                Color #87cefa
            END Detail
        END MapList


        BEGIN MapAnnotations
        END MapAnnotations

        BEGIN DisplayFlags
            ShowLabels           On
            ShowPassLabel        Off
            ShowElsetNum         Off
            ShowGndTracks        On
            ShowGndMarkers       On
            ShowOrbitMarkers     On
            ShowPlanetOrbits     Off
            ShowPlanetCBIPos     On
            ShowPlanetCBILabel   On
            ShowPlanetGndPos     On
            ShowPlanetGndLabel   On
            ShowSensors          On
            ShowWayptMarkers     Off
            ShowWayptTurnMarkers Off
            ShowOrbits           On
            ShowDtedRegions      Off
            ShowAreaTgtCentroids On
            ShowToolBar          On
            ShowStatusBar        On
            ShowScrollBars       On
            AllowAnimUpdate      Off
            AccShowLine          On
            AccAnimHigh          On
            AccStatHigh          On
            ShowPrintButton      On
            ShowAnimButtons      On
            ShowAnimModeButtons  On
            ShowZoomMsrButtons   On
            ShowMapCbButton      Off
        END DisplayFlags

        BEGIN SoftVTR
            OutputFormat     WMV
            BaseName         Frame
            Digits           4
            Frame            0
            LastAnimTime     0.000000
            OutputMode       Normal
            HiResAssembly    Assemble
            HRWidth          6000
            HRHeight         4500
            HRDPI            600.000000
            UseSnapInterval  No
            SnapInterval     0.000000
            WmvCodec         "Windows Media Video 9"
            Framerate        30
            Bitrate          3000000
        END SoftVTR


        BEGIN TimeDisplay
            Show             0
            TextColor        #ffffff
            TextTranslucency 0.000000
            ShowBackground   0
            BackColor        #4d4d4d
            BackTranslucency 0.400000
            XPosition        20
            YPosition        -20
        END TimeDisplay

        BEGIN LightingData
            DisplayAltitude              0.000000
            SubsolarPoint                Off
            SubsolarPointColor           #ffff00
            SubsolarPointMarkerStyle     2

            ShowUmbraLine                Off
            UmbraLineColor               #000000
            UmbraLineStyle               0
            UmbraLineWidth               2
            FillUmbra                    On
            UmbraFillColor               #000000
            ShowSunlightLine             Off
            SunlightLineColor            #ffff00
            SunlightLineStyle            0
            SunlightLineWidth            2
            FillSunlight                 On
            SunlightFillColor            #ffffff
            SunlightMinOpacity           0.000000
            SunlightMaxOpacity           0.200000
            UmbraMaxOpacity              0.700000
            UmbraMinOpacity              0.400000
        END LightingData
    END Map

    BEGIN MapStyles

        UseStyleTime        No

        BEGIN Style
        Name                DefaultWithBing
        Time                191023563.000000
        UpdateDelta         10.000000

        BEGIN MapAttributes
            PrimaryBody          Earth
            SecondaryBody        Sun
            CenterLatitude       0.000000
            CenterLongitude      0.000000
            ProjectionAltitude   63621860.000000
            FieldOfView          35.000000
            OrthoDisplayDistance 20000000.000000
            TransformTrajectory  On
            EquatorialRadius     6378137.000000
            BackgroundColor      #000000
            LatLonLines          On
            LatSpacing           30.000000
            LonSpacing           30.000000
            LatLonLineColor      #999999
            LatLonLineStyle      2
            ShowOrthoDistGrid    Off
            OrthoGridXSpacing    5
            OrthoGridYSpacing    5
            OrthoGridColor       #ffffff
            ShowImageExtents     Off
            ImageExtentLineColor #ffffff
            ImageExtentLineStyle 0
            ImageExtentLineWidth 1.000000
            ShowImageNames       Off
            ImageNameFont        0
            Projection           EquidistantCylindrical
            Resolution           VeryLow
            CoordinateSys        ECF
            UseBackgroundImage   On
            UseBingForBackground On
            BingType             Aerial
            BingLogoHorizAlign   Right
            BingLogoVertAlign    Bottom
            BackgroundImageFile  Basic.bmp
            UseNightLights       Off
            NightLightsFactor    3.500000
            UseCloudsFile        Off
            BEGIN ZoomLocations
                BEGIN ZoomLocation
                    CenterLat    0.000000
                    CenterLon    0.000000
                    ZoomWidth    359.999998
                    ZoomHeight   180.000000
                End ZoomLocation
            END ZoomLocations
            UseVarAspectRatio    No
            SwapMapResolution    Yes
            NoneToVLowSwapDist   2000000.000000
            VLowToLowSwapDist    20000.000000
            LowToMediumSwapDist  10000.000000
            MediumToHighSwapDist 5000.000000
            HighToVHighSwapDist  1000.000000
            VHighToSHighSwapDist 100.000000
            BEGIN Axes
                DisplayAxes no
                CoordSys    CBI
                2aryCB      Sun
                Display+x   yes
                Label+x     yes
                Color+x     #ffffff
                Scale+x     3.000000
                Display-x   yes
                Label-x     yes
                Color-x     #ffffff
                Scale-x     3.000000
                Display+y   yes
                Label+y     yes
                Color+y     #ffffff
                Scale+y     3.000000
                Display-y   yes
                Label-y     yes
                Color-y     #ffffff
                Scale-y     3.000000
                Display+z   yes
                Label+z     yes
                Color+z     #ffffff
                Scale+z     3.000000
                Display-z   yes
                Label-z     yes
                Color-z     #ffffff
                Scale-z     3.000000
            END Axes

        END MapAttributes

        BEGIN MapList
            BEGIN Detail
                Alias RWDB2_Coastlines
                Show Yes
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_International_Borders
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Islands
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Lakes
                Show No
                Color #87cefa
            END Detail
            BEGIN Detail
                Alias RWDB2_Provincial_Borders
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Rivers
                Show No
                Color #87cefa
            END Detail
        END MapList


        BEGIN MapAnnotations
        END MapAnnotations

        BEGIN SoftVTR
            OutputFormat     WMV
            BaseName         Frame
            Digits           4
            Frame            0
            LastAnimTime     0.000000
            OutputMode       Normal
            HiResAssembly    Assemble
            HRWidth          6000
            HRHeight         4500
            HRDPI            600.000000
            UseSnapInterval  No
            SnapInterval     0.000000
            WmvCodec         "Windows Media Video 9"
            Framerate        30
            Bitrate          3000000
        END SoftVTR


        BEGIN TimeDisplay
            Show             0
            TextColor        #ffffff
            TextTranslucency 0.000000
            ShowBackground   0
            BackColor        #4d4d4d
            BackTranslucency 0.400000
            XPosition        20
            YPosition        -20
        END TimeDisplay

        BEGIN LightingData
            DisplayAltitude              0.000000
            SubsolarPoint                Off
            SubsolarPointColor           #ffff00
            SubsolarPointMarkerStyle     2

            ShowUmbraLine                Off
            UmbraLineColor               #000000
            UmbraLineStyle               0
            UmbraLineWidth               2
            FillUmbra                    On
            UmbraFillColor               #000000
            ShowSunlightLine             Off
            SunlightLineColor            #ffff00
            SunlightLineStyle            0
            SunlightLineWidth            2
            FillSunlight                 On
            SunlightFillColor            #ffffff
            SunlightMinOpacity           0.000000
            SunlightMaxOpacity           0.200000
            UmbraMaxOpacity              0.700000
            UmbraMinOpacity              0.400000
        END LightingData

        ShowDtedRegions     Off

        End Style

        BEGIN Style
        Name                DefaultWithoutBing
        Time                191023563.000000
        UpdateDelta         10.000000

        BEGIN MapAttributes
            PrimaryBody          Earth
            SecondaryBody        Sun
            CenterLatitude       0.000000
            CenterLongitude      0.000000
            ProjectionAltitude   63621860.000000
            FieldOfView          35.000000
            OrthoDisplayDistance 20000000.000000
            TransformTrajectory  On
            EquatorialRadius     6378137.000000
            BackgroundColor      #000000
            LatLonLines          On
            LatSpacing           30.000000
            LonSpacing           30.000000
            LatLonLineColor      #999999
            LatLonLineStyle      2
            ShowOrthoDistGrid    Off
            OrthoGridXSpacing    5
            OrthoGridYSpacing    5
            OrthoGridColor       #ffffff
            ShowImageExtents     Off
            ImageExtentLineColor #ffffff
            ImageExtentLineStyle 0
            ImageExtentLineWidth 1.000000
            ShowImageNames       Off
            ImageNameFont        0
            Projection           EquidistantCylindrical
            Resolution           VeryLow
            CoordinateSys        ECF
            UseBackgroundImage   On
            UseBingForBackground Off
            BingType             Aerial
            BingLogoHorizAlign   Right
            BingLogoVertAlign    Bottom
            BackgroundImageFile  Basic.bmp
            UseNightLights       Off
            NightLightsFactor    3.500000
            UseCloudsFile        Off
            BEGIN ZoomLocations
                BEGIN ZoomLocation
                    CenterLat    0.000000
                    CenterLon    0.000000
                    ZoomWidth    359.999998
                    ZoomHeight   180.000000
                End ZoomLocation
            END ZoomLocations
            UseVarAspectRatio    No
            SwapMapResolution    Yes
            NoneToVLowSwapDist   2000000.000000
            VLowToLowSwapDist    20000.000000
            LowToMediumSwapDist  10000.000000
            MediumToHighSwapDist 5000.000000
            HighToVHighSwapDist  1000.000000
            VHighToSHighSwapDist 100.000000
            BEGIN Axes
                DisplayAxes no
                CoordSys    CBI
                2aryCB      Sun
                Display+x   yes
                Label+x     yes
                Color+x     #ffffff
                Scale+x     3.000000
                Display-x   yes
                Label-x     yes
                Color-x     #ffffff
                Scale-x     3.000000
                Display+y   yes
                Label+y     yes
                Color+y     #ffffff
                Scale+y     3.000000
                Display-y   yes
                Label-y     yes
                Color-y     #ffffff
                Scale-y     3.000000
                Display+z   yes
                Label+z     yes
                Color+z     #ffffff
                Scale+z     3.000000
                Display-z   yes
                Label-z     yes
                Color-z     #ffffff
                Scale-z     3.000000
            END Axes

        END MapAttributes

        BEGIN MapList
            BEGIN Detail
                Alias RWDB2_Coastlines
                Show Yes
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_International_Borders
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Islands
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Lakes
                Show No
                Color #87cefa
            END Detail
            BEGIN Detail
                Alias RWDB2_Provincial_Borders
                Show No
                Color #8fbc8f
            END Detail
            BEGIN Detail
                Alias RWDB2_Rivers
                Show No
                Color #87cefa
            END Detail
        END MapList


        BEGIN MapAnnotations
        END MapAnnotations

        BEGIN SoftVTR
            OutputFormat     WMV
            BaseName         Frame
            Digits           4
            Frame            0
            LastAnimTime     0.000000
            OutputMode       Normal
            HiResAssembly    Assemble
            HRWidth          6000
            HRHeight         4500
            HRDPI            600.000000
            UseSnapInterval  No
            SnapInterval     0.000000
            WmvCodec         "Windows Media Video 9"
            Framerate        30
            Bitrate          3000000
        END SoftVTR


        BEGIN TimeDisplay
            Show             0
            TextColor        #ffffff
            TextTranslucency 0.000000
            ShowBackground   0
            BackColor        #4d4d4d
            BackTranslucency 0.400000
            XPosition        20
            YPosition        -20
        END TimeDisplay

        BEGIN LightingData
            DisplayAltitude              0.000000
            SubsolarPoint                Off
            SubsolarPointColor           #ffff00
            SubsolarPointMarkerStyle     2

            ShowUmbraLine                Off
            UmbraLineColor               #000000
            UmbraLineStyle               0
            UmbraLineWidth               2
            FillUmbra                    On
            UmbraFillColor               #000000
            ShowSunlightLine             Off
            SunlightLineColor            #ffff00
            SunlightLineStyle            0
            SunlightLineWidth            2
            FillSunlight                 On
            SunlightFillColor            #ffffff
            SunlightMinOpacity           0.000000
            SunlightMaxOpacity           0.200000
            UmbraMaxOpacity              0.700000
            UmbraMinOpacity              0.400000
        END LightingData

        ShowDtedRegions     Off

        End Style

    END MapStyles

END MapData

        BEGIN GfxClassPref

        END GfxClassPref


        BEGIN ConnectGraphicsOptions

            AsyncPickReturnUnique          OFF

        END ConnectGraphicsOptions

    END Graphics
    
    BEGIN Overlays
    END Overlays
    
    BEGIN VO
    END VO

END Extensions

BEGIN SubObjects

Class Aircraft

	CertAircraft

END Class

Class AreaTarget

	Runway

END Class

Class Constellation

	Constellation1

END Class

Class Place

	Ica
	Paracas

END Class

Class Satellite

	Aqua_27424
	Aura_28376
	CertSatellite
	Cloudsat_29107
	Coriolis_27640
	Geoeye1_33331
	Landsat8_39084
	Terra_25994
	Worldview1_32060
	Worldview2_35946

END Class

END SubObjects

BEGIN References
    Instance *
        *
        Constellation/Constellation1
    END Instance
    Instance Aircraft/CertAircraft
        *
        Aircraft/CertAircraft
        Aircraft/CertAircraft/Sensor/AC_Camera
    END Instance
    Instance Aircraft/CertAircraft/Sensor/AC_Camera
        Aircraft/CertAircraft/Sensor/AC_Camera
    END Instance
    Instance AreaTarget/Runway
        AreaTarget/Runway
    END Instance
    Instance Constellation/Constellation1
    END Instance
    Instance Place/Ica
        *
        Place/Ica
    END Instance
    Instance Place/Paracas
        Place/Paracas
    END Instance
    Instance Satellite/Aqua_27424
        Constellation/Constellation1
        Satellite/Aqua_27424
        Satellite/Aqua_27424/Sensor/Aqua_Modis_Vis_Ir_FixedPt_FieldOfView
    END Instance
    Instance Satellite/Aqua_27424/Sensor/Aqua_Modis_Vis_Ir_FixedPt_FieldOfView
        Satellite/Aqua_27424/Sensor/Aqua_Modis_Vis_Ir_FixedPt_FieldOfView
    END Instance
    Instance Satellite/Aura_28376
        Constellation/Constellation1
        Satellite/Aura_28376
    END Instance
    Instance Satellite/CertSatellite
        *
        Satellite/CertSatellite
        Satellite/CertSatellite/Sensor/Sat_Camera
    END Instance
    Instance Satellite/CertSatellite/Sensor/Sat_Camera
        Satellite/CertSatellite/Sensor/Sat_Camera
    END Instance
    Instance Satellite/Cloudsat_29107
        Constellation/Constellation1
        Satellite/Cloudsat_29107
    END Instance
    Instance Satellite/Coriolis_27640
        Constellation/Constellation1
        Satellite/Coriolis_27640
    END Instance
    Instance Satellite/Geoeye1_33331
        Constellation/Constellation1
        Satellite/Geoeye1_33331
        Satellite/Geoeye1_33331/Sensor/Geoeye1_Gis_FieldOfRegard
        Satellite/Geoeye1_33331/Sensor/Geoeye1_Gis_Vis_Ir_BodyPt_FieldOfView
    END Instance
    Instance Satellite/Geoeye1_33331/Sensor/Geoeye1_Gis_FieldOfRegard
        Satellite/Geoeye1_33331/Sensor/Geoeye1_Gis_FieldOfRegard
    END Instance
    Instance Satellite/Geoeye1_33331/Sensor/Geoeye1_Gis_Vis_Ir_BodyPt_FieldOfView
        Satellite/Geoeye1_33331/Sensor/Geoeye1_Gis_Vis_Ir_BodyPt_FieldOfView
    END Instance
    Instance Satellite/Landsat8_39084
        Constellation/Constellation1
        Satellite/Landsat8_39084
        Satellite/Landsat8_39084/Sensor/Landsat8_Oli_Vis_Ir_FixedPt_FieldOfView
        Satellite/Landsat8_39084/Sensor/Landsat8_Tirs_Ir_FixedPt_FieldOfView
    END Instance
    Instance Satellite/Landsat8_39084/Sensor/Landsat8_Oli_Vis_Ir_FixedPt_FieldOfView
        Satellite/Landsat8_39084/Sensor/Landsat8_Oli_Vis_Ir_FixedPt_FieldOfView
    END Instance
    Instance Satellite/Landsat8_39084/Sensor/Landsat8_Tirs_Ir_FixedPt_FieldOfView
        Satellite/Landsat8_39084/Sensor/Landsat8_Tirs_Ir_FixedPt_FieldOfView
    END Instance
    Instance Satellite/Terra_25994
        Constellation/Constellation1
        Satellite/Terra_25994
        Satellite/Terra_25994/Sensor/Terra_AsterAftA_FieldOfRegard
        Satellite/Terra_25994/Sensor/Terra_AsterAftA_Ir_GimbalPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_AsterB_FieldOfRegard
        Satellite/Terra_25994/Sensor/Terra_AsterB_Ir_MirrorPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_AsterC_FieldOfRegard
        Satellite/Terra_25994/Sensor/Terra_AsterC_Ir_MirrorPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_AsterNadirA_FieldOfRegard
        Satellite/Terra_25994/Sensor/Terra_AsterNadirA_Vis_Ir_GimbalPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_MisrAftA_Vis_Ir_FixedPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_MisrAftB_Vis_Ir_FixedPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_MisrAftC_Vis_Ir_FixedPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_MisrAftD_Vis_Ir_FixedPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_MisrForeA_Vis_Ir_FixedPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_MisrForeB_Vis_Ir_FixedPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_MisrForeC_Vis_Ir_FixedPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_MisrForeD_Vis_Ir_FixedPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_MisrNadir_Vis_Ir_FixedPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_Modis_Vis_Ir_FixedPt_FieldOfView
    END Instance
    Instance Satellite/Terra_25994/Sensor/Terra_AsterAftA_FieldOfRegard
        Satellite/Terra_25994/Sensor/Terra_AsterAftA_FieldOfRegard
    END Instance
    Instance Satellite/Terra_25994/Sensor/Terra_AsterAftA_Ir_GimbalPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_AsterAftA_Ir_GimbalPt_FieldOfView
    END Instance
    Instance Satellite/Terra_25994/Sensor/Terra_AsterB_FieldOfRegard
        Satellite/Terra_25994/Sensor/Terra_AsterB_FieldOfRegard
    END Instance
    Instance Satellite/Terra_25994/Sensor/Terra_AsterB_Ir_MirrorPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_AsterB_Ir_MirrorPt_FieldOfView
    END Instance
    Instance Satellite/Terra_25994/Sensor/Terra_AsterC_FieldOfRegard
        Satellite/Terra_25994/Sensor/Terra_AsterC_FieldOfRegard
    END Instance
    Instance Satellite/Terra_25994/Sensor/Terra_AsterC_Ir_MirrorPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_AsterC_Ir_MirrorPt_FieldOfView
    END Instance
    Instance Satellite/Terra_25994/Sensor/Terra_AsterNadirA_FieldOfRegard
        Satellite/Terra_25994/Sensor/Terra_AsterNadirA_FieldOfRegard
    END Instance
    Instance Satellite/Terra_25994/Sensor/Terra_AsterNadirA_Vis_Ir_GimbalPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_AsterNadirA_Vis_Ir_GimbalPt_FieldOfView
    END Instance
    Instance Satellite/Terra_25994/Sensor/Terra_MisrAftA_Vis_Ir_FixedPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_MisrAftA_Vis_Ir_FixedPt_FieldOfView
    END Instance
    Instance Satellite/Terra_25994/Sensor/Terra_MisrAftB_Vis_Ir_FixedPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_MisrAftB_Vis_Ir_FixedPt_FieldOfView
    END Instance
    Instance Satellite/Terra_25994/Sensor/Terra_MisrAftC_Vis_Ir_FixedPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_MisrAftC_Vis_Ir_FixedPt_FieldOfView
    END Instance
    Instance Satellite/Terra_25994/Sensor/Terra_MisrAftD_Vis_Ir_FixedPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_MisrAftD_Vis_Ir_FixedPt_FieldOfView
    END Instance
    Instance Satellite/Terra_25994/Sensor/Terra_MisrForeA_Vis_Ir_FixedPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_MisrForeA_Vis_Ir_FixedPt_FieldOfView
    END Instance
    Instance Satellite/Terra_25994/Sensor/Terra_MisrForeB_Vis_Ir_FixedPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_MisrForeB_Vis_Ir_FixedPt_FieldOfView
    END Instance
    Instance Satellite/Terra_25994/Sensor/Terra_MisrForeC_Vis_Ir_FixedPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_MisrForeC_Vis_Ir_FixedPt_FieldOfView
    END Instance
    Instance Satellite/Terra_25994/Sensor/Terra_MisrForeD_Vis_Ir_FixedPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_MisrForeD_Vis_Ir_FixedPt_FieldOfView
    END Instance
    Instance Satellite/Terra_25994/Sensor/Terra_MisrNadir_Vis_Ir_FixedPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_MisrNadir_Vis_Ir_FixedPt_FieldOfView
    END Instance
    Instance Satellite/Terra_25994/Sensor/Terra_Modis_Vis_Ir_FixedPt_FieldOfView
        Satellite/Terra_25994/Sensor/Terra_Modis_Vis_Ir_FixedPt_FieldOfView
    END Instance
    Instance Satellite/Worldview1_32060
        Constellation/Constellation1
        Satellite/Worldview1_32060
        Satellite/Worldview1_32060/Sensor/Worldview1_Wv60_FieldOfRegard
        Satellite/Worldview1_32060/Sensor/Worldview1_Wv60_Vis_Ir_BodyPt_FieldOfView
    END Instance
    Instance Satellite/Worldview1_32060/Sensor/Worldview1_Wv60_FieldOfRegard
        Satellite/Worldview1_32060/Sensor/Worldview1_Wv60_FieldOfRegard
    END Instance
    Instance Satellite/Worldview1_32060/Sensor/Worldview1_Wv60_Vis_Ir_BodyPt_FieldOfView
        Satellite/Worldview1_32060/Sensor/Worldview1_Wv60_Vis_Ir_BodyPt_FieldOfView
    END Instance
    Instance Satellite/Worldview2_35946
        Constellation/Constellation1
        Satellite/Worldview2_35946
        Satellite/Worldview2_35946/Sensor/Worldview2_Wv110_FieldOfRegard
        Satellite/Worldview2_35946/Sensor/Worldview2_Wv110_Vis_Ir_BodyPt_FieldOfView
    END Instance
    Instance Satellite/Worldview2_35946/Sensor/Worldview2_Wv110_FieldOfRegard
        Satellite/Worldview2_35946/Sensor/Worldview2_Wv110_FieldOfRegard
    END Instance
    Instance Satellite/Worldview2_35946/Sensor/Worldview2_Wv110_Vis_Ir_BodyPt_FieldOfView
        Satellite/Worldview2_35946/Sensor/Worldview2_Wv110_Vis_Ir_BodyPt_FieldOfView
    END Instance
END References

END Scenario
