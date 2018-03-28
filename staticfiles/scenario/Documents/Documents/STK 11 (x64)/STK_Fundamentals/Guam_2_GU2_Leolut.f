stk.v.11.0
WrittenBy    STK_v11.2.0

BEGIN Facility

Name        Guam_2_GU2_Leolut

	BEGIN CentroidPosition

		CentralBody            Earth
		DisplayCoords          Geodetic
		EcfLatitude            1.35783330000000e+01
		EcfLongitude           1.44939200000000e+02
		EcfAltitude            2.37000000000000e+02
		HeightAboveGround      0.00000000000000e+00
		ComputeTrnMaskAsNeeded Off
		DisplayAltRef          Ellipsoid
		UseTerrainInfo         Off
		NumAzRaysInMask        360
		TerrainNormalMode      UseCbShape

	END CentroidPosition

BEGIN Extensions
    
    BEGIN LaserCAT
    END LaserCAT
    
    BEGIN ExternData
    END ExternData
    
    BEGIN RFI
    END RFI
    
    BEGIN ADFFileData
    END ADFFileData
    
    BEGIN AccessConstraints
		LineOfSight   IncludeIntervals 
    END AccessConstraints
    
    BEGIN ObjectCoverage
    END ObjectCoverage
    
    BEGIN Desc
    Begin ShortText
Guam 2 GU2 Leolut
Name:           Guam 2 GU2 Leolut
Country:        UnitedStates
Location:       Guam
Status:         Active
Type:           GroundStation
Alternate name: COSPAR 3384
Notes:          The LEOLUT (LEOSAR Local User Terminal) is a satellite ground station that receives and processes the signal of COSPAS-SARSAT low earth orbiting satellites and transmits distress alerts to the associated Mission Control Centre (MCC).
Sources:                       Cospas-Sarsat Data Distribution Plan C/S A.001, Issue 6, October 2010
Last updated:   2011-06-01
    End ShortText
    Begin LongText
Name:           Guam 2 GU2 Leolut
Country:        UnitedStates
Location:       Guam
Status:         Active
Type:           GroundStation
Alternate name: COSPAR 3384
Notes:          The LEOLUT (LEOSAR Local User Terminal) is a satellite ground station that receives and processes the signal of COSPAS-SARSAT low earth orbiting satellites and transmits distress alerts to the associated Mission Control Centre (MCC).
Sources:                       Cospas-Sarsat Data Distribution Plan C/S A.001, Issue 6, October 2010
Last updated:   2011-06-01
    End LongText
    END Desc
    
    BEGIN Atmosphere
<?xml version = "1.0" standalone = "yes"?>
<VAR name = "STK_Atmosphere_Extension">
    <SCOPE Class = "AtmosphereExtension">
        <VAR name = "Version">
            <STRING>&quot;1.0.0 a&quot;</STRING>
        </VAR>
        <VAR name = "ComponentName">
            <STRING>&quot;STK_Atmosphere_Extension&quot;</STRING>
        </VAR>
        <VAR name = "Description">
            <STRING>&quot;STK Atmosphere Extension&quot;</STRING>
        </VAR>
        <VAR name = "Type">
            <STRING>&quot;STK Atmosphere Extension&quot;</STRING>
        </VAR>
        <VAR name = "UserComment">
            <STRING>&quot;STK Atmosphere Extension&quot;</STRING>
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
        <VAR name = "InheritAtmosAbsorptionModel">
            <BOOL>true</BOOL>
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
        <VAR name = "EnableLocalRainData">
            <BOOL>false</BOOL>
        </VAR>
        <VAR name = "LocalRainIsoHeight">
            <QUANTITY Dimension = "DistanceUnit" Unit = "m">
                <REAL>2000</REAL>
            </QUANTITY>
        </VAR>
        <VAR name = "LocalRainRate">
            <QUANTITY Dimension = "SlowRate" Unit = "mm*hr^-1">
                <REAL>1</REAL>
            </QUANTITY>
        </VAR>
        <VAR name = "LocalSurfaceTemp">
            <QUANTITY Dimension = "Temperature" Unit = "K">
                <REAL>293.15</REAL>
            </QUANTITY>
        </VAR>
    </SCOPE>
</VAR>    END Atmosphere
    
    BEGIN Identification
    END Identification
    
    BEGIN Crdn
    END Crdn
    
    BEGIN Graphics

            BEGIN Attributes

                MarkerColor             #ffff00
                LabelColor              #ffff00
                LineStyle               0
                MarkerStyle             5
                FontStyle               0

            END Attributes

            BEGIN Graphics

                Show                    On
                Inherit                 On
                IsDynamic               Off
                ShowLabel               On
                ShowAzElMask            Off
                ShowAzElFill            Off
                AzElFillStyle           7
                AzElFillAltTranslucency 0.500000
                UseAzElColor            Off
                AzElColor               #ffffff
                MinDisplayAlt           0.000
                MaxDisplayAlt           10000000.000
                NumAzElMaskSteps        1
                ShowAzElAtRangeMask       Off
                ShowAzElAtRangeFill       Off
                AzElFillRangeTranslucency 0.500000
                AzElAtRangeFillStyle      7
                UseAzElAtRangeColor          Off
                AzElAtRangeColor          #ffffff
                MinDisplayRange           0.000
                MaxDisplayRange           1000000.000
                NumAzElAtRangeMaskSteps   10

            END Graphics

        BEGIN DisplayTimes
            DisplayType	AlwaysOn
        END DisplayTimes
    END Graphics
    
    BEGIN VO
    END VO

END Extensions

BEGIN SubObjects

END SubObjects

END Facility

