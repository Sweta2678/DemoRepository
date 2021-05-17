else if (FormatHelper.hasContent(productVOToPersist.getChannelExclusive())
				&& validateSingleAttribute("CHANNELEXCLUSIVE", productVOToPersist.getChannelExclusive()) == null) {
			Msg = Msg + " ChannelExclusive " + " With value Key " + productVOToPersist.getChannelExclusive() + " is not Present in Attribute Store";
			status = false;