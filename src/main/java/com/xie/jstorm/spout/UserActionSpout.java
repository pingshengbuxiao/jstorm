package com.xie.jstorm.spout;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.xie.jstorm.utils.WordUtils;

import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.IRichSpout;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Values;
import edu.emory.mathcs.backport.java.util.Arrays;

public class UserActionSpout implements IRichSpout {

	private SpoutOutputCollector collector;
	private Integer tastId;
	
	public void nextTuple() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("start send touple");
			List<Object> tuples = new ArrayList<Object>();
			tuples.add(WordUtils.getChinese());
			collector.emit(tuples);
			System.out.println("end send touple "+tuples);
			Values v = new Values("");
		}
	}

	public void open(Map arg0, TopologyContext context, SpoutOutputCollector collector) {
		this.collector = collector;
		tastId = context.getThisTaskId();
	}

	public void ack(Object arg0) {

	}

	public void activate() {

	}

	public void close() {

	}

	public void deactivate() {

	}

	public void fail(Object arg0) {

	}

	public void declareOutputFields(OutputFieldsDeclarer declare) {
		declare.declare(new Fields("word"));
	}

	public Map<String, Object> getComponentConfiguration() {
		return null;
	}

}
