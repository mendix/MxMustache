// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mxlists.actions;

import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import mxlists.proxies.SeriesItem;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;

public class GenerateDateTimeSeries extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.util.Date StartDateTime;
	private java.util.Date EndDateTime;
	private java.lang.Long IntervalValue;
	private mxlists.proxies.DateTimeIntervalEnum IntervalUnit;

	public GenerateDateTimeSeries(IContext context, java.util.Date StartDateTime, java.util.Date EndDateTime, java.lang.Long IntervalValue, java.lang.String IntervalUnit)
	{
		super(context);
		this.StartDateTime = StartDateTime;
		this.EndDateTime = EndDateTime;
		this.IntervalValue = IntervalValue;
		this.IntervalUnit = IntervalUnit == null ? null : mxlists.proxies.DateTimeIntervalEnum.valueOf(IntervalUnit);
	}

	@Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		// BEGIN USER CODE
        ArrayList<IMendixObject> resultList = new ArrayList<IMendixObject>();
        SeriesItem nextItem = new SeriesItem(getContext());
        nextItem.setDateTimeValue(StartDateTime);
        ZoneId zone = ZoneId.systemDefault();
        TemporalUnit intervalUnit = ChronoUnit.DAYS;
        switch (IntervalUnit.getCaption()) {
            case "Day":
                intervalUnit = ChronoUnit.DAYS;
                break;
            case "Week":
                intervalUnit = ChronoUnit.WEEKS;
                break;
            case "Month":
                intervalUnit = ChronoUnit.MONTHS;
                break;
            case "Year":
                intervalUnit = ChronoUnit.YEARS;
                break;
            case "Quarter":
                intervalUnit = ChronoUnit.MONTHS;
                break;
            case "Weekday":
                intervalUnit = ChronoUnit.DAYS;
                break;
        }
        logger.debug(String.format("Interval %s %s", IntervalValue, intervalUnit));
        int count = 0;
        while (nextItem.getDateTimeValue().before(EndDateTime) && count < 10000) {
            count ++;
            logger.debug("next datetime series item: " + nextItem.getDateTimeValue());
            resultList.add(nextItem.getMendixObject());
            SeriesItem item = new SeriesItem(getContext());

            Instant instant = nextItem.getDateTimeValue().toInstant();
            logger.debug(String.format("instant %s", instant));
            LocalDateTime nextDateTime = LocalDateTime.ofInstant(instant, zone);
            if (IntervalUnit.getCaption().equals("Quarter")) {
                nextDateTime = nextDateTime.plus(3, intervalUnit);
            } else {
                nextDateTime = nextDateTime.plus(IntervalValue, intervalUnit);
            }
            logger.debug(String.format("next date time %s", nextDateTime));
            item.setDateTimeValue(Date.from(nextDateTime.atZone(zone).toInstant()));
            nextItem = item;
        }
        return resultList;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "GenerateDateTimeSeries";
	}

	// BEGIN EXTRA CODE
    private ILogNode logger = Core.getLogger("MxLists");
	// END EXTRA CODE
}