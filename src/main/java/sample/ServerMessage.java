package sample;

import java.util.Date;

/*
 * Message received from server.
 *
 * @Author Jay Sridhar
 */
public class ServerMessage
{
    private String from;
    private String message;
    private String topic;
    private Date time = new Date();

    public ServerMessage() {}

    public ServerMessage(String from,String message,String topic)
    {
	this.from = from;
	this.message = message;
	this.topic = topic;
    }

    public String getFrom()
    {
        return from;
    }

    public void setFrom(String from)
    {
        this.from = from;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getTopic()
    {
        return topic;
    }

    public void setTopic(String topic)
    {
        this.topic = topic;
    }

    public Date getTime()
    {
        return time;
    }

    public String toString()
    {
	return String
	    .format("{from: %1$-10s | topic: %2$-10s | time: %4$-15d | mesg: %3$s}",
		    getFrom(), getTopic(),
		    getMessage(), getTime().getTime());
    }
}
